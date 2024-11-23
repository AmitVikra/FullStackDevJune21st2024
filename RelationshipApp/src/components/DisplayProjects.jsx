import React, { useEffect, useState } from 'react'
import axios from 'axios'
const DisplayProjects = () => {
    const [projects, setProjects] = useState([])

    async function showProjects() {
        const response = await axios.get('http://localhost:9091/api/v1/projects')
        const listprojects = response.data
        setProjects(listprojects)
        console.log(listprojects)

    }

    useEffect(() => {
        showProjects()
    }, [])

  return (
    <div>
        <div className="container-fluid">
                <div className="row mt-5">
                    <div className="col-md-12">
                        <table className='table table-bordered table-striped'>
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Project Name</th>
                                    <th>Description</th> 
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    projects.map((project) => {
                                        return (
                                            <>
                                                <tr key={project.projectId}>
                                                    <td>{project.projectId}</td>
                                                    <td>{project.projectDomain}</td>
                                                    <td>{project.projectDescription}</td>
                                                </tr>
                                            </>
                                        )
                                    })
                                }
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
    </div>
  )
}

export default DisplayProjects