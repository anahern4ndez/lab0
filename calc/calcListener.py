# Generated from calc.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .calcParser import calcParser
else:
    from calcParser import calcParser

# This class defines a complete listener for a parse tree produced by calcParser.
class calcListener(ParseTreeListener):

    # Enter a parse tree produced by calcParser#prog.
    def enterProg(self, ctx:calcParser.ProgContext):
        pass

    # Exit a parse tree produced by calcParser#prog.
    def exitProg(self, ctx:calcParser.ProgContext):
        pass


    # Enter a parse tree produced by calcParser#printExpr.
    def enterPrintExpr(self, ctx:calcParser.PrintExprContext):
        pass

    # Exit a parse tree produced by calcParser#printExpr.
    def exitPrintExpr(self, ctx:calcParser.PrintExprContext):
        pass


    # Enter a parse tree produced by calcParser#assign.
    def enterAssign(self, ctx:calcParser.AssignContext):
        pass

    # Exit a parse tree produced by calcParser#assign.
    def exitAssign(self, ctx:calcParser.AssignContext):
        pass


    # Enter a parse tree produced by calcParser#blank.
    def enterBlank(self, ctx:calcParser.BlankContext):
        pass

    # Exit a parse tree produced by calcParser#blank.
    def exitBlank(self, ctx:calcParser.BlankContext):
        pass


    # Enter a parse tree produced by calcParser#parens.
    def enterParens(self, ctx:calcParser.ParensContext):
        pass

    # Exit a parse tree produced by calcParser#parens.
    def exitParens(self, ctx:calcParser.ParensContext):
        pass


    # Enter a parse tree produced by calcParser#MulDiv.
    def enterMulDiv(self, ctx:calcParser.MulDivContext):
        pass

    # Exit a parse tree produced by calcParser#MulDiv.
    def exitMulDiv(self, ctx:calcParser.MulDivContext):
        pass


    # Enter a parse tree produced by calcParser#AddSub.
    def enterAddSub(self, ctx:calcParser.AddSubContext):
        pass

    # Exit a parse tree produced by calcParser#AddSub.
    def exitAddSub(self, ctx:calcParser.AddSubContext):
        pass


    # Enter a parse tree produced by calcParser#id.
    def enterId(self, ctx:calcParser.IdContext):
        pass

    # Exit a parse tree produced by calcParser#id.
    def exitId(self, ctx:calcParser.IdContext):
        pass


    # Enter a parse tree produced by calcParser#int.
    def enterInt(self, ctx:calcParser.IntContext):
        pass

    # Exit a parse tree produced by calcParser#int.
    def exitInt(self, ctx:calcParser.IntContext):
        pass



del calcParser