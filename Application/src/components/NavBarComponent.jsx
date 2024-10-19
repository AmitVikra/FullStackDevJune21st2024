import React from 'react'
import { Link } from 'react-router-dom'

const NavBarComponent = () => {
    return (
        <div>
            <nav className="navbar navbar-expand-lg bg-primary">
                <div className="container-fluid">
                    <a className="navbar-brand text-white" href="#">Application</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNav">
                        <ul className="navbar-nav">
                            <li className="nav-item">
                                <Link to={'/'} className="nav-link active text-white" aria-current="page" href="#">Home</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/services'} className="nav-link text-white" href="#">Services</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/courses'} className="nav-link text-white" href="#">Courses</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/contact'} className="nav-link text-white" href="#">Contact Us</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/about'} className="nav-link text-white" href="#">About Us</Link>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    )
}

export default NavBarComponent