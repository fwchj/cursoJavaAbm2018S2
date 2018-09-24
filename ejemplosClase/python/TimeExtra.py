## Display the time in CDMX
import time ## imports the package
import math ## Math package

timestamp = time.time() ## Seconds since 01/01/1970 (with decimals)

timediff = input("What is your time zone? \n\t(put +1 for 1 hour ahead of GMT, \n\tor -5 for 5 hours behind GMT\n")
timestamp +=60*60*float(timediff)
seconds = math.floor(timestamp%60)
minutes = math.floor(timestamp / 60 %60)
hours = math.floor(timestamp/(60*60) % 24)

print(hours,":",minutes,":",seconds)

