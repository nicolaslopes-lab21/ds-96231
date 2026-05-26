import { useState } from 'react'
import './style.css'

export default function InfoCurso()  {
    const [nome, setNome] = useState('Logica de Programação')
    const [cargaHoraria, setCargaHoraria] = useState(162)
    const [dataInicio, setdataInicio] = useState('03/02/2025')
    const [dataTermino, setDataTermino] = useState('23/07/2025')

    return (
        <div className='info-curso'>
            <h2>Dados do curso:</h2>
            <p>nome: { nome }</p>
            <p>Carga horaria: { cargaHoraria }</p>
            <p>Carga de inicio: { dataInicio }</p>
            <p>Carga de termino: { dataTermino }</p>
            
        </div>
    )
    
}
    
