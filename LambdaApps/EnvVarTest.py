import boto3
import json
import os


def lambda_handler(event, context):
    envValue = os.environ['TEST_ENV']
    sqs = boto3.resource('sqs')
    queue = sqs.get_queue_by_name(QueueName='TestQueue1')
    print envValue
    queue.send_message(MessageBody=json.dumps(event))
    return envValue
