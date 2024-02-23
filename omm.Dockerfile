# Use an official Python image as the base
FROM python:3.8

# Set the working directory inside the container
WORKDIR /WhampX692/whampx

# Copy your application files into the container
COPY /WhampX692/whampx/

# Specify the command to run when the container starts
CMD ["python", "my_fristpy.py"]
