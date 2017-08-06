import os

def lambda_handler(event, context):
    return os.environ('TEST_ENV')