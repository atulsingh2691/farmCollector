# farmCollector
# Farm Collector API Documentation

This project is a Spring Boot application that manages harvesting data from farms. It provides APIs to record and retrieve information about planted and harvested crops per farm.

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Setup](#setup)
3. [API Endpoints](#api-endpoints)
    - [1. Add Harvesting Data](#1-add-harvesting-data)
    - [2. Get All Harvesting Data](#2-get-all-harvesting-data)
    - [3. Get Harvesting Data by ID](#3-get-harvesting-data-by-id)
    - [4. Update Harvesting Data](#4-update-harvesting-data)
    - [5. Delete Harvesting Data](#5-delete-harvesting-data)
4. [Running the Application](#running-the-application)
5. [Testing](#testing)
6. [Configuration](#configuration)
7. [Additional Notes](#additional-notes)

   API Endpoints
1. Add Harvesting Data
Endpoint: POST /api/harvesting-data

Description: Adds new harvesting data.

Request Body:

{
  "farmName": "Farm A",
  "cropType": "Corn",
  "actualAmount": 10.5
}


Response: Returns the added harvesting data with generated ID.

2. Get All Harvesting Data
Endpoint: GET /api/harvesting-data
Description: Retrieves all harvesting data recorded.
3. Get Harvesting Data by ID
Endpoint: GET /api/harvesting-data/{id}
Description: Retrieves harvesting data by its ID.
Parameters: {id} - ID of the harvesting data.
4. Update Harvesting Data
Endpoint: PUT /api/harvesting-data/{id}

Description: Updates harvesting data by its ID.

Parameters: {id} - ID of the harvesting data.

Request Body:

{
  "farmName": "Farm A Updated",
  "cropType": "Corn",
  "actualAmount": 12.5
}


5. Delete Harvesting Data
Endpoint: DELETE /api/harvesting-data/{id}
Description: Deletes harvesting data by its ID.
Parameters: {id} - ID of the harvesting data.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 17
- Maven
- MySQL

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/farm-collector.git
   cd farm-collector
