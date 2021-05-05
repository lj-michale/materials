# -*- coding: utf-8 -*-#

# -------------------------------------------------------------------------------
# Name:         computer_builder
# Description:
# Author:       orange
# Date:         2021/5/5
# -------------------------------------------------------------------------------


class Computer:
    """
    电脑
    """
    def __init__(self, serial_number):
        self.serial = serial_number
        self.memory = None
        self.hdd = None
        self.gpu = None

    def __str__(self):
        info = ('Memory:{}GB'.format(self.memory),
                'Hard Disk:{}GB'.format(self.hdd),
                'Graphics Card:{}'.format(self.gpu))
        return '\n'.join(info)


class CommputerBuilder:
    """
    电脑建造者
    """
    def __init__(self):
        self.computer = Computer('AG23322393')

    def configure_memory(self, amount):
        self.computer.memory = amount

    def configure_hdd(self, amount):
        self.computer.hdd = amount

    def configure_gpu(self, gpu_model):
        self.computer.gpu = gpu_model


class HardwareEngineer:
    """
    指挥者
    """
    def __init__(self):
        self.builder = None

    def construct_computer(self, memory, hdd, gpu):
        self.builder = CommputerBuilder()
        [step for step in(self.builder.configure_memory(memory),
                          self.builder.configure_hdd(hdd),
                          self.builder.configure_gpu(gpu))]

    # @property
    # def computer(self):
    #     return self.builder.computer


 def main():
    engineer = HardwareEngineer()
    engineer.construct_computer(hdd=500, memory=8, gpu='GeForce GTX 650Ti')
    computer = engineer.computer
    print(computer)


if __name__ == '__main__':
    main()