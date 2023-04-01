import os

def print_docs(directory):
    for file in os.listdir(directory):
        path = os.path.join(directory,file)
        if os.path.isdir(path):
            print(path)
            print_docs(path)
        else:
            print(path)


directory = "path"
print_docs(directory)