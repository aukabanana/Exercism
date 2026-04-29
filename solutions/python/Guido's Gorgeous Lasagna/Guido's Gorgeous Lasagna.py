EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(minute):
    """Calculate the bake time remaining"""
    return EXPECTED_BAKE_TIME - minute

def preparation_time_in_minutes(number_of_layers):
    """Calculate preparation time in minutes"""
    return PREPARATION_TIME * number_of_layers

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes)
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time