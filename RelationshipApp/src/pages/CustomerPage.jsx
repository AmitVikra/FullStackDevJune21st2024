import React from 'react'
import NavBarComponent from '../components/NavBarComponent'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { createCustomer } from '../services/Services'
import DisplayCustomers from '../components/DisplayCustomers'
const CustomerPage = () => {
    const [customerName, setCustomerName] = useState('')
    const [customerDescription, setCustomerDescription] = useState('')

    const navigate = useNavigate();
    const handleCustomerName=(e)=>{
        setCustomerName(e.target.value)
    }

    const handleCustomerDesc=(e)=>{
        setCustomerDescription(e.target.value)
    }

    const navigateHome=()=>{
        navigate("/home")
    }

    const saveCustomer=(e)=>{
        const customer={customerName, customerDescription}
        console.log("Customer Information here for Debug")
        console.log(customer)

        createCustomer(customer).then((response) =>{
            console.log(response.data)
            navigate('/home')
        })
    }
    return (
        <div>
            <NavBarComponent />
            <div className="container-fluid">
                <div className="row justify-content-evenly">
                    <h2 className='text-center'>Customers</h2>
                    <div className="card col-md-6">
                        <div className="card-body">
                           <form>
                            <div className='form-group'>
                                <label className='form-label'>Customer Name:</label>
                                <div>
                                <input 
                                        type='text'
                                        placeholder='Enter Customer Name'
                                        name='customerName'
                                        value={customerName}
                                        onChange={handleCustomerName}
                                    /> 
                                </div>
                            </div>

                           
                            <div className='form-group mb-4'>
                                <label className='form-label'>Customer Description:</label>
                                <div>
                                <input 
                                        type='text'
                                        placeholder='Enter Description'
                                        name='customerDescription'
                                        value={customerDescription}
                                        onChange={handleCustomerDesc}
                                    /> 
                                </div>
                            </div>
                            <button className='btn btn-success' onClick={saveCustomer}>Save</button>
                            <button className='btn btn-danger ms-2' onClick={navigateHome}>Cancel</button>
                           </form>
                        </div>
                    </div>
                    <DisplayCustomers/>
                </div>
            </div>
        </div>
    )
}

export default CustomerPage