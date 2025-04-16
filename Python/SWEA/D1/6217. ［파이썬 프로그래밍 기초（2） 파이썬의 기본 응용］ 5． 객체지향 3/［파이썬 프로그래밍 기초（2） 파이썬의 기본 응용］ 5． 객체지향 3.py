class Student:
    def __init__(self,name):
        self.name = name
    def print(self):
        print(f'이름: {self.name}')
        
class GraduateStudent:
    def __init__(self,name,major):
        self.name = name
        self.major = major
    def print(self):
        print(f'이름: {self.name}, 전공: {self.major}')
        
Student1 = Student('홍길동')
Student2 = GraduateStudent('이순신', '컴퓨터')
Student1.print()
Student2.print()