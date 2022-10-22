import React, { useEffect, useState } from "react"; 
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import {Container, Paper, Button} from '@material-ui/core';


export default function Student() {
        const paperStyle={padding:'50px 20px', width:600, margin:"20px auto"}
        const[firstname,setFirstname] = useState('')
        const[lastname, setLastname]=useState('')
        const[program, setProgram]=useState('')
        const[yearlevel, setYearlevel]=useState('')
        const[students, setStudents] = useState([])
        
        const handleClick=(e)=>{
            e.preventDefault()
            const student={firstname, lastname, program, yearlevel}
            console.log(student)
            fetch("http://localhost:8080/student/postStudent", {
                method:"POST",
                headers:{"Content-Type":"application/json"},
                body:JSON.stringify(student)
            }).then(()=>{
                console.log("New Student Added")
            })
        }



    useEffect(()=>{
        fetch("http://localhost:8080/student/getAllStudents")
            .then(res=>res.json())
            .then((result)=>{
                setStudents(result);
            })
    },[])

    return (


    <Container>
            <Paper elevation={3} style={paperStyle}>
                <h1 style={{color:"blue"}}><u>Add Student</u></h1>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Firstname" variant="outlined" fullWidth value={firstname} onChange={(e)=>setFirstname(e.target.value)}/>
      <TextField id="outlined-basic" label="Lastname" variant="outlined" fullWidth value={lastname}  onChange={(e)=>setLastname(e.target.value)}/>
      <TextField id="outlined-basic" label="Program" variant="outlined" fullWidth value={program}  onChange={(e)=>setProgram(e.target.value)}/>
      <TextField id="outlined-basic" label="yearlevel" variant="outlined" fullWidth value={yearlevel}  onChange={(e)=>setYearlevel(e.target.value)}/>
    
      <Button variant="contained" onClick={handleClick}>Submit</Button>

    </Box>
    </Paper>

      <h1>Students</h1>
    <Paper elevation = {3} style={paperStyle}>
      {students.map(student=>(
        <Paper elevation={6} style={{margin:"10px", padding:"15px", textAlign:"left"}} key={student.id}>
        First Name:{student.firstname}<br/>
        Last Name:{student.lastname}<br/>
        Program:{student.program}<br/>
        Year Level:{student.yearlevel}<br/>
        </Paper>))}
    </Paper>  
    </Container>
  );
}
