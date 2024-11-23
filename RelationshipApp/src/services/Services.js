import axios from "axios"

const BASE_URL_CUSTOMER='http://localhost:9091/api/v1/customer'
const BASE_URL_PROJECT='http://localhost:9091/api/v1/project'

export const createCustomer=(customer)=>{
    axios.post(BASE_URL_CUSTOMER, customer)
}

export const createProject=(project)=>{
    axios.post(BASE_URL_PROJECT, project)
}