import React, { useState } from 'react'
import {useNavigate} from 'react-router-dom'
import LoginHeader from '../components/LoginHeader'
const LoginPage = () => {
    const [userName, setUserName]=useState('')
    const [password, setPassword]=useState('')

   const navigate = useNavigate();
    const handleUserName=(e)=>{
        setUserName(e.target.value)
    }

    const handlePassword=(e) =>{
        setPassword(e.target.value)
    }
    
    const handleHomePage=()=>{
        if(userName=='admin' && password=='manager')
        {
            navigate('/home')
        }
    }

    const handleCancel=()=>{
        navigate('/')
    }
  return (
    <div>
        <LoginHeader/>
        <div className="container-fluid">
            <div className="row justify-content-center p-5">
                <div className="card col-md-6">
                    <div className='card-body'>
                        <form>
                            <div className='form-group'>
                                <label className='form-label'>User Name:</label>
                                <div>
                                    <input
                                        type='text'
                                        name='userName'
                                        value={userName}
                                        onChange={handleUserName}
                                    />
                                </div>
                            </div>

                            <div className='form-group'>
                                <label className='form-label'>Password:</label>
                                <div>
                                    <input
                                        type='password'
                                        name='password'
                                        value={password}
                                        onChange={handlePassword}
                                    />
                                </div>
                            </div>
                            <button className='btn btn-success mt-3 me-3' onClick={handleHomePage}>Login</button>
                            <button className='btn btn-danger mt-3' onClick={handleCancel}>Cancel</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
  )
}

export default LoginPage