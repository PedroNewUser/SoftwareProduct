import './ListarUsuario.css'
import { useEffect, useState } from 'react'


function ListarUsuario(){
    const [users, setUsers] = useState([]);


    async function listUser() {
        const api = await fetch("http://localhost:8090/produto/listproduct")
        const resposta = await api.json()

        if (api.ok) {
            setUsers(resposta)
        } else {
            alert("Erro")
            return false
        }

    }

    useEffect(() => {
        listUser()
    }, []);

export default ListarUsuario;}