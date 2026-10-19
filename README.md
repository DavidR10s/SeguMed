
![Logo](segumed.png)


# SeguMed

Plataforma inteligente de seguimiento de tratamientos con recordatorios y reportes.

# Inicio rápido


## Comandos de desarrollo
|	Comando				    |			Uso			|
|:----------------------------:|:---------------------------------:|
|	```docker compose up -d```	|	Levantar todos los contenedores	|
|	```docker exec -it segumed-backend bash```	|	acceder a la bash del entorno de desarrollo backend	|


# Arbol del proyecto

```<?xml version="1.0" encoding="UTF-8"?> .  
├── backend  
│ ├── Dockerfile  
│ ├── segumed  
│ │ ├── HELP.md  
│ │ ├── mvnw  
│ │ ├── mvnw.cmd  
│ │ ├── pom.xml  
│ │ ├── src  
│ │ │ ├── main  
│ │ │ │ ├── java  
│ │ │ │ │ └── com  
│ │ │ │ │ └── app  
│ │ │ │ │ └── segumed  
│ │ │ │ │ ├── controllers  
│ │ │ │ │ │ ├── HomeController.java  
│ │ │ │ │ │ ├── MedicoController.java  
│ │ │ │ │ │ ├── PacienteController.java  
│ │ │ │ │ │ └── TratamientoController.java  
│ │ │ │ │ ├── dto  
│ │ │ │ │ │ ├── medico  
│ │ │ │ │ │ │ ├── CrearMedicoDTO.java  
│ │ │ │ │ │ │ └── MedicoDTO.java  
│ │ │ │ │ │ ├── paciente  
│ │ │ │ │ │ │ ├── CrearPacienteDTO.java  
│ │ │ │ │ │ │ └── PacienteDTO.java  
│ │ │ │ │ │ └── UsuarioDTO.java  
│ │ │ │ │ ├── enums  
│ │ │ │ │ │ ├── EstadoTratamiento.java  
│ │ │ │ │ │ └── RoleUsuario.java  
│ │ │ │ │ ├── mappers  
│ │ │ │ │ │ ├── MedicoMapper.java  
│ │ │ │ │ │ └── PacienteMapper.java  
│ │ │ │ │ ├── models  
│ │ │ │ │ │ ├── Cita.java  
│ │ │ │ │ │ ├── Medico.java  
│ │ │ │ │ │ ├── Paciente.java  
│ │ │ │ │ │ ├── Reporte.java  
│ │ │ │ │ │ ├── Tratamiento.java  
│ │ │ │ │ │ └── Usuario.java  
│ │ │ │ │ ├── repositories  
│ │ │ │ │ │ ├── ICitaRepository.java  
│ │ │ │ │ │ ├── IMedicoRepository.java  
│ │ │ │ │ │ ├── IPacienteRepository.java  
│ │ │ │ │ │ ├── IReporteRepository.java  
│ │ │ │ │ │ ├── ITratamientoRepository.java  
│ │ │ │ │ │ └── IUsuarioRepository.java  
│ │ │ │ │ ├── SegumedApplication.java  
│ │ │ │ │ └── services  
│ │ │ │ │ ├── cita  
│ │ │ │ │ │ ├── CitaService.java  
│ │ │ │ │ │ └── ICitaService.java  
│ │ │ │ │ ├── medico  
│ │ │ │ │ │ ├── IMedicoService.java  
│ │ │ │ │ │ └── MedicoService.java  
│ │ │ │ │ ├── paciente  
│ │ │ │ │ │ ├── IPacienteService.java  
│ │ │ │ │ │ └── PacienteService.java  
│ │ │ │ │ ├── reporte  
│ │ │ │ │ │ ├── IReporteService.java  
│ │ │ │ │ │ └── ReporteService.java  
│ │ │ │ │ └── tratamiento  
│ │ │ │ │ ├── ITratamientoService.java  
│ │ │ │ │ └── TratamientoService.java  
│ │ │ │ └── resources  
│ │ │ │ ├── application.properties  
│ │ │ │ ├── static  
│ │ │ │ └── templates  
│ │ │ └── test  
│ │ │ └── java  
│ │ │ └── com  
│ │ │ └── app  
│ │ │ └── segumed  
│ │ │ └── SegumedApplicationTests.java  
│ │ └── target  
│ │ ├── classes  
│ │ │ ├── application.properties  
│ │ │ └── com  
│ │ │ └── app  
│ │ │ └── segumed  
│ │ │ ├── controllers  
│ │ │ │ ├── HomeController.class  
│ │ │ │ ├── MedicoController.class  
│ │ │ │ ├── PacienteController.class  
│ │ │ │ └── TratamientoController.class  
│ │ │ ├── dto  
│ │ │ │ ├── medico  
│ │ │ │ │ ├── CrearMedicoDTO.class  
│ │ │ │ │ └── MedicoDTO.class  
│ │ │ │ ├── paciente  
│ │ │ │ │ ├── CrearPacienteDTO.class  
│ │ │ │ │ └── PacienteDTO.class  
│ │ │ │ └── UsuarioDTO.class  
│ │ │ ├── enums  
│ │ │ │ ├── EstadoTratamiento.class  
│ │ │ │ └── RoleUsuario.class  
│ │ │ ├── mappers  
│ │ │ │ ├── MedicoMapper.class  
│ │ │ │ └── PacienteMapper.class  
│ │ │ ├── models  
│ │ │ │ ├── Cita.class  
│ │ │ │ ├── Medico.class  
│ │ │ │ ├── Paciente.class  
│ │ │ │ ├── Reporte.class  
│ │ │ │ ├── Tratamiento.class  
│ │ │ │ └── Usuario.class  
│ │ │ ├── repositories  
│ │ │ │ ├── ICitaRepository.class  
│ │ │ │ ├── IMedicoRepository.class  
│ │ │ │ ├── IPacienteRepository.class  
│ │ │ │ ├── IReporteRepository.class  
│ │ │ │ ├── ITratamientoRepository.class  
│ │ │ │ └── IUsuarioRepository.class  
│ │ │ ├── SegumedApplication.class  
│ │ │ └── services  
│ │ │ ├── cita  
│ │ │ │ ├── CitaService.class  
│ │ │ │ └── ICitaService.class  
│ │ │ ├── medico  
│ │ │ │ ├── IMedicoService.class  
│ │ │ │ └── MedicoService.class  
│ │ │ ├── paciente  
│ │ │ │ ├── IPacienteService.class  
│ │ │ │ └── PacienteService.class  
│ │ │ ├── reporte  
│ │ │ │ ├── IReporteService.class  
│ │ │ │ └── ReporteService.class  
│ │ │ └── tratamiento  
│ │ │ ├── ITratamientoService.class  
│ │ │ └── TratamientoService.class  
│ │ ├── generated-sources  
│ │ │ └── annotations  
│ │ ├── generated-test-sources  
│ │ │ └── test-annotations  
│ │ ├── maven-status  
│ │ │ └── maven-compiler-plugin  
│ │ │ ├── compile  
│ │ │ │ └── default-compile  
│ │ │ │ ├── createdFiles.lst  
│ │ │ │ └── inputFiles.lst  
│ │ │ └── testCompile  
│ │ │ └── default-testCompile  
│ │ │ ├── createdFiles.lst  
│ │ │ └── inputFiles.lst  
│ │ └── test-classes  
│ │ └── com  
│ │ └── app  
│ │ └── segumed  
│ │ └── SegumedApplicationTests.class  
│ ├── segumed.zip  
│ └── target  
│ ├── classes  
│ ├── generated-sources  
│ │ └── annotations  
│ ├── generated-test-sources  
│ │ └── test-annotations  
│ └── test-classes  
├── docker-compose.yml  
├── frontend  
│ ├── Dockerfile  
│ └── node_modules  
├── README.md  
├── SeguMed.drawio  
├── Segumed.drawio.png  
├── segumed.jpg  
└── segumed.png
```