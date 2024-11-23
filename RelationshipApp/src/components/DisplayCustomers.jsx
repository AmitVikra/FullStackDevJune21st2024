import React, { useEffect, useState } from 'react'
import axios from 'axios'
const DisplayCustomers = () => {
    const [customers, setCustomers] = useState([])

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
            <div className="container-fluid">
                <div className="row mt-5">
                    <div className="col-md-12">
                        <table className='table table-bordered table-striped'>
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Customer Name</th>
                                    <th>Description</th> 
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    customers.map((customer) => {
                                        return (
                                            <>
                                                <tr key={customer.customerId}>
                                                    <td>{customer.customerId}</td>
                                                    <td>{customer.customerName}</td>
                                                    <td>{customer.customerDescription}</td>
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

export default DisplayCustomers