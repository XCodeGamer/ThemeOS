import tkinter as tk
from tkinter import messagebox

def open_issues():
    messagebox.showinfo("Submit", "Open your repo and create an Issue to submit a theme!")

root = tk.Tk()
root.title("Theme OS — Mario Theme")
root.geometry("700x450")
root.configure(bg="#4fc3f7") # mario blue

title = tk.Label(root, text="🍄 Theme OS — Mario Theme", font=("Helvetica", 20, "bold"), fg="#c62828", bg="#4fc3f7")
title.pack(pady=(20,10))

trial = tk.Label(root, text="Trial Version — 10 days", font=("Helvetica", 12, "bold"), fg="#ffd54f", bg="#4fc3f7")
trial.pack(pady=(0,10))

frame = tk.Frame(root, bg="#fff7e6", padx=20, pady=20)
frame.pack(pady=20, padx=20, fill="both", expand=True)

desc = tk.Label(frame, text="Welcome! Use Issues to request themes. Themes can include colors, moods, and layouts.", wraplength=600, bg="#fff7e6")
desc.pack()

btn = tk.Button(root, text="Submit Theme (Open Issue)", bg="#ffd54f", command=open_issues)
btn.pack(pady=12)

root.mainloop()
