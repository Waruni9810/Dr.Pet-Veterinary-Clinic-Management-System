# Dr.Pet Veterinary Clinic Management System

The **Dr.Pet Veterinary Clinic Management System** is a desktop application designed to assist veterinary clinics with managing their day-to-day operations such as pet record management, scheduling appointments, and maintaining medical histories for animals. The system also includes features for administrative staff, doctors, and pharmacists to streamline workflow within the clinic.

## Features
- **User Authentication**: Secure login system with different user roles, including Admin, Doctor, Receptionist, and Pharmacist.
- **Pet Records Management**: Track pet details, medical history, treatments, and owner information.
- **Appointment Scheduling**: Schedule, modify, and manage appointments for pets with veterinarians.
- **Prescription Management**: Manage and issue prescriptions for pets, accessible by doctors and pharmacists.
- **Role-based Access**: Each user type (Admin, Doctor, Receptionist, etc.) has specific permissions for managing relevant clinic functions.

## Technologies Used
- **Java**: Core programming language for the application.
- **NetBeans IDE 8.2**: Integrated development environment used for project development.
- **Swing**: Java library for building graphical user interfaces (GUIs).
- **MySQL (Optional)**: Relational database for storing clinic data, such as pet information, appointment schedules, and user roles.

## Project Structure
```bash
Dr.Pet_Vet/
├── src/
│   ├── Control/
│   ├── Design/
│   ├── Model/
│   ├── View/
│   │   ├── Admin/
│   │   ├── Doctor/
│   │   ├── Pharmacist/
│   │   ├── Receptionist/
│   │   └── Splash1.java
└── README.md

Usage
Login: Admin, Doctor, Receptionist, and Pharmacist can log in with their credentials.
Admin: Full access to all modules, including user management, pet records, and appointments.
Doctor: Manage pet records, view appointments, and issue prescriptions.
Receptionist: Schedule appointments and manage client inquiries.
Pharmacist: View and issue prescriptions for pets.