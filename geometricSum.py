'''
Write a Python program to calculate the geometric sum of n-1. Go to the editor
Note: In mathematics, a geometric series is a series with a constant ratio between successive terms.
'''

def geometric_sum(n):
    if n<0:
        return 0
    else:
        return 1/2**n + geometric_sum(n-1)
 
print(geometric_sum(6))