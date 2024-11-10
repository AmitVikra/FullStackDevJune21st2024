import React from 'react'
import NavBarComponent from '../components/NavBarComponent'

const CustomerPage = () => {
    const [customerName, setCustomerName] = useState('')
    const [customerDescription, setCustomerDescription] = useState('')

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
                                <label className='form-label'>Product Name:</label>
                                <div>
                                <input 
                                        type='text'
                                        placeholder='Enter Product Name'
                                        name='productName'
                                        value={productName}
                                        onChange={handleProductName}
                                    /> 
                                </div>
                            </div>

                           
                            <div className='form-group mb-4'>
                                <label className='form-label'>Product Description:</label>
                                <div>
                                <input 
                                        type='text'
                                        placeholder='Enter Description'
                                        name='productDesc'
                                        value={productDesc}
                                        onChange={handleProductDesc}
                                    /> 
                                </div>
                            </div>
                            <button className='btn btn-success' onClick={saveProduct}>{ id ? "Update" : "Save"}</button>
                            <button className='btn btn-danger ms-2' onClick={navigateHome}>Cancel</button>
                           </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default CustomerPage