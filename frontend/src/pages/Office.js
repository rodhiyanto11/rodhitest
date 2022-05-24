import axios from 'axios'
import React from 'react'
import { toast } from 'react-toastify'
import { Link } from "react-router-dom"
const Office = () => {
    const [state, setState] = React.useState()
    const handleChange = async (e) => {
        switch (e.target.name) {
            case "officeid":
                setState((prev) => ({ ...prev, officeid: e.target.value }))
                break;
           
            default:
                break;
        }
    }
    const handleSubmit = async () => {
        await axios({
            url: `http://localhost:8080/api/office`,
            method: 'post',
            // headers: {
            //     Authorization: `Bearer ${localStorage.getItem('access_token')}`
            // },
            data: state
        })
            .then((res) => {
                toast.success(JSON.stringify(res.data), {
                    position: "top-center",
                    autoClose: 3000,
                });
            })
            .catch((e) => {
                toast.error(e.response.data.message.substring(0, 200), {
                    position: "top-center",
                    autoClose: 3000,
                });

            })
    }
    return (
        <React.Fragment>
            <div className="loading">
                <div className="row">
                    <div className="form-group">
                        <label for="exampleInputEmail1">Office</label>
                        <input type="email" className="form-control" placeholder="Enter name" name="officeid" onChange={(e) => handleChange(e)} />
                        {/* <small id="emailHelp" className="form-text text-muted">We'll never share your email with anyone else.</small> */}
                    </div>
                    
                    <div className="form-group mt-2">
                        <label><Link to="/">Input Office</Link></label>
                    </div>
                    <div className="form-group mt-2">

                        <button className="btn btn-primary" onClick={() => handleSubmit()}>Press</button>
                    </div>
                </div>
            </div>
        </React.Fragment>
    )
}

export default Office