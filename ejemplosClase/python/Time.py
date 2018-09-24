## Display the time in CDMX
import time ## imports the package
import math ## Math package

timestamp = time.time() ## Seconds since 01/01/1970 (with decimals)

timestamp -=60*60*5
seconds = math.floor(timestamp%60)
minutes = math.floor(timestamp / 60 %60)
hours = math.floor(timestamp/(60*60) % 24)

print(hours,":",minutes,":",seconds)

