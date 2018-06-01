from flask import Flask, request, redirect, render_template
import cgi

app = Flask(__name__)

app.config['DEBUG'] = True 
check = 0

@app.route("/login", methods=["POST"])
def login():
    username=request.form("username")
    password=request.form("password")
    vpass=request.form("vpass")

    if len(username) < 3:
        error = "Invalid Username"
        return error
    elif len(password) < 3:
        errorp = "Invalid Password"
        return errorp
    elif vpass != password:
        errorc = "Passwords Do Not Match"
        return errorc
    else:
         return render_template("login.html", username=username)


@app.route("/")
def index():
    return render_template('edit.html')
app.run()