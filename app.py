from flask import Flask, request, jsonify, render_template
import os

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/download', methods=['POST'])
def download():
    subreddit = request.json.get('subreddit')
    # Implement downloading functionality here
    return jsonify({'status': 'success', 'subreddit': subreddit})

if __name__ == '__main__':
    app.run(debug=True)