import React, { useState } from 'react'
import TitleComponent from '../components/TitleComponent'

const Contact = () => {
  const[fullename, setFullName]=useState('')
  const[email, setEmail]=useState('')
  const[phone, setPhone]=useState('')
  const[message, setMessage]=useState('')
  
  const handleFullName=(e)=>{
    setFullName(e.target.value)
  }

  const handleEMail=(e)=>{
    setEmail(e.target.value)
  }


  const handleMessage=(e)=>{
    setMessage(e.target.value)
  }

  const handlePhoneNumber=(e)=>{
    setPhone(e.target.value)
  }

  const handleSubmit=(e)=>{
    e.preventDefault()
    console.log(fullename, email, phone, message)
  }

  const handleCancel=()=>{
    setFullName('')
    setEmail('')
    setPhone('')
    setMessage('')
  }

  return (
    <div>
        <TitleComponent title="Contact Us Page" />
        <div className="container-fluid">
          <div className="row justify-content-evenly" style={{backgroundColor:'#f1f1f1'}}>
            <div className="col-md-5">
                <h3 className='text-center'>Confor Form</h3>
                <form onSubmit={handleSubmit}>
                  <div className='p-2'>
                    <label htmlFor='fullname' >FullName:</label>
                    <input type='text'
                      name='fullname'
                      value={fullename}
                      onChange={handleFullName}
                    />
                  </div>
                  <div className='p-2'>
                    <label htmlFor='email' >EMail:</label>
                    <input type='email'
                      name='email'
                      value={email}
                      onChange={handleEMail}
                    />
                  </div>
                  <div className='p-2'>
                    <label htmlFor='phone'>Phone:</label>
                    <input type='text'
                      name='phone'
                      value={phone}
                      onChange={handlePhoneNumber}
                    />
                  </div>

                  <div className='p-2'>
                    <label htmlFor='message'>Message:</label>
                    <textarea type='text'
                      name='message'
                      value={message}
                      onChange={handleMessage}
                    />
                  </div>
                  <div className='p-2'>
                    <button type='submit'className='me-4 btn btn-primary'>Submit</button>
                    <button type='button' onClick={handleCancel} className='btn btn-danger'>Cancel</button>
                  </div>
                </form>
            </div>
            <div className="col-md-5"></div>
          </div>
        </div>
    </div>
  )
}

export default Contact