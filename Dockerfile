# Use an official Python image as the base
FROM python:3.8

# Set the working directory inside the container
#WORKDIR /WhampX692/whampx/app/

# Copy your application files into the container
COPY src/myfristpy.py myfile.py

RUN ["python","myfile.py"]
# Specify the command to run when the container starts
CMD ["python", "myfile.py"]
