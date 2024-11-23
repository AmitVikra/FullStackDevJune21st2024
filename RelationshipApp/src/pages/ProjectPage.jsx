import React, { useEffect } from 'react'
import axios from "axios"
import { useNavigate } from 'react-router-dom'
import NavBarComponent from '../components/NavBarComponent'
import DisplayProjects from '../components/DisplayProjects'
import { useState } from 'react'
import { createProject, getAllCustomers } from '../services/Services'
const ProjectPage = () => {
  const [projectDomain, setProjectDomain] = useState('')
  const [projectDescription, setProjectDescription] = useState('')
  const [projectCustomerId, setProjectCustomerId] = useState(0)
  const [customers, setCustomers] = useState([])

  const navigate = useNavigate();

  const handleProjectDomain = (e) => {
    setProjectDomain(e.target.value)
  }

  const handleProjectDesc = (e) => {
    setProjectDescription(e.target.value)
  }

  const handleCustomerProjectId = (e) => {
    setProjectCustomerId(e.target.value)
  }

  const navigateHome = () => {
    navigate("/home")
  }

  const saveProject = (e) => {

    const project = { projectDomain, projectDescription, projectCustomerId }
    console.log("Project Information here for Debug")
    console.log(project)

    createProject(project)
      .then((response) => {
        console.log(response.data)
        navigate("/projects")
        return (response.data)
      }).catch(error => {
        console.log(error)
      })
  }

  async function showCustomer() {
    const response = await axios.get('http://localhost:9091/api/v1/customers')
    const listcustomers = response.data
    setCustomers(listcustomers)
    console.log(listcustomers)

}

useEffect(() => {
    showCustomer()
}, [])

  return (
    <div>
      <NavBarComponent />
      <div className="container-fluid">
        <div className="row justify-content-evenly">
          <h2 className='text-center'>Projects</h2>
          <div className="card col-md-6">
            <div className="card-body">
              <form>
                <div className='form-group'>
                  <label className='form-label'>Project Domain:</label>
                  <div>
                    <input
                      type='text'
                      placeholder='Enter Project Domain'
                      name='projectDomain'
                      value={projectDomain}
                      onChange={handleProjectDomain}
                    />
                  </div>
                </div>


                <div className='form-group '>
                  <label className='form-label'>Project Description:</label>
                  <div>
                    <input
                      type='text'
                      placeholder='Enter Description'
                      name='projectDescription'
                      value={projectDescription}
                      onChange={handleProjectDesc}
                    />
                  </div>
                </div>

                <div className='form-group mb-4'>
                  <label className='form-label'>Customer Name:</label>
                  <div>
                    <select value={projectCustomerId} onChange={handleCustomerProjectId}>
                      {
                        customers.map(customer => (
                          <option value={customer.customerId}>{customer.customerName}</option>
                        ))
                      }
                    </select>
                    <h6>Customer Id :  {projectCustomerId}</h6>
                  </div>
                </div>

                <button className='btn btn-success' onClick={saveProject}>Save</button>
                <button className='btn btn-danger ms-2' onClick={navigateHome}>Cancel</button>
              </form>
            </div>
          </div>
          <DisplayProjects />
        </div>
      </div>


    </div>
  )
}

export default ProjectPage