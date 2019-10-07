from flask import Flask
from flask_restful import Resource, Api

app = Flask(__name__)
api = Api(app)


class Presentation(Resource):
    def get(self):
        return {
            'name': 'Mobile Payment Service',
            'language': 'PYTHON',
            'framework': 'Flask|Flask-Restfull',
            'version': '0.8',
            'role': 'Je suis le service qui interagit les operateurs de payment mobile',
            'desc': 'We love microservice yes, and docker is amazing',
            'siteOfficiel': 'https://flask-restful.readthedocs.io/en/latest/'
        }


api.add_resource(Presentation, '/presentation')

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True)
