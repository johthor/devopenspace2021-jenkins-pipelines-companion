#!/bin/bash

if [[ $1 == production ]]; then
    echo "Deploying to Production environment"
    echo "..."
    sleep 5s

    if [[ $2 == SuP3rS3cR3t ]]; then
        echo "Deployed version $3 to Production"
        echo ""
        echo "production/$3"
    else
        echo "Deployment failed: Wrong credentials"
        exit 1
    fi
elif [[ $1 == staging ]]; then
    echo "Deploying to Staging environment"
    echo "..."
    sleep 5s

    if [[ $2 == sicher ]]; then
        echo "Deployed version $3 to Staging"
    else
        echo "Deployment failed: Wrong credentials"
        exit 1
    fi
else
    echo "Deployment failed"
    exit 1
fi
