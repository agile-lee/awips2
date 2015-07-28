#!/bin/bash 
# DR #4360 - This scripts assigns a name to tables' unique constraints

PSQL="/awips2/psql/bin/psql"

cmdDir=`dirname $0`

source ${cmdDir}/commonFunctions.sh

# A table listed here doesn't need changes to any columns or the change
# is handled in some other script.
tables=("acarssounding" "binlightning" "bufrncwf" "bufrmosavn" "bufrmoseta" "bufrmosgfs" "bufrmoshpc"
"bufrmoslamp" "bufrmosmrf" "bufrmosngm" "bufrquikscat" "bufrsigwx" "bufrua" "cwa" "cwat" "ffmp" "fog"
"fssobs" "goessounding" "ldad_manual" "ldadhydro" "ldadprofiler" "modelsounding" "obs" "poessounding"
"profiler" "qc" "sfcobs" "svrwx" "tcg" "tcs")
echo "INFO: rename tables unique constraints"

for table in ${tables[@]} ; do
	renameConstraint ${table} uk_${table}_datauri_fields
done

echo "INFO: Done rename tables unique constraints"
