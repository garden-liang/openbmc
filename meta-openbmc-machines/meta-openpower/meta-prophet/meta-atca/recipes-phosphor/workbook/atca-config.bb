SUMMARY = "Atca board wiring"
DESCRIPTION = "Board wiring information for the Atca system."
PR = "r1"

inherit config-in-skeleton

PROVIDES_remove = "virtual/obmc-inventory-data"
RPROVIDES_${PN}_remove = "virtual-obmc-inventory-data"
