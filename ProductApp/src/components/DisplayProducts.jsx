import React, { useEffect, useState } from 'react'
import axios from 'axios'
const DisplayProducts = () => {
    const [products, setProducts] = useState([])

    async function showProduct(){
        const response= await axios.get('http://localhost:9093/v1/api/products')
        const listproducts = response.data
        setProducts(listproducts)
        console.log(listproducts)

    }

    useEffect(() =>{
        showProduct()
    },[])
  return (
    <div>
        <div className="container-fluid">
            <div className="row">
                <h3 className='text-center'>Products Details</h3>
                <div className="col-md-12">
                    <table className='table table-bordered table-stripped'>
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Product Type</th>
                                <th>Description</th>
                                <th>Created Date</th>
                                <th>ModifiedDate</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                products.map((product) =>{
                                    return(
                                        <>
                                        <tr>
                                            <td>{product.id}</td>
                                            <td>{product.productName}</td>
                                            <td>{product.productType}</td>
                                            <td>{product.productDesc}</td>
                                            <td>{product.createdAt}</td>
                                            <td>{product.updatedAt}</td>
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

export default DisplayProducts