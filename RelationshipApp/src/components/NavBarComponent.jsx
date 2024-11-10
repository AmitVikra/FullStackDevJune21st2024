import React from 'react'
import { useNavigate } from 'react-router-dom'
import { Link } from 'react-router-dom'
const NavBarComponent = () => {
    const navigate = useNavigate()
    const handleLogout=()=>{
        navigate("/")
    }
    return (
        <div>
            <nav className="navbar navbar-expand-lg bg-primary">
                <div className="container-fluid">
                    <a className="navbar-brand text-white" href="#">Customer & Project</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNav">
                        <ul className="navbar-nav">
                            <li className="nav-item">
                                <Link to={'/customers'} className="nav-link active text-white" aria-current="page" href="#">Customers</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/projects'} className="nav-link text-white" href="#">Projects</Link>
                            </li>
                        </ul>
                    </div>
                    <div>
                        <button className='btn btn-outline-light text-white' onClick={handleLogout}>Logout</button>
                    </div>
                </div>
            </nav>
        </div>
    )
}

export default NavBarComponent