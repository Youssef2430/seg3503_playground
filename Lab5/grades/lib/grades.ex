defmodule Grades do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """

  defmodule Calculator do
    def percentage_grade(grades) do
      h = grades[:homework]
      labs = grades[:labs]
      mid = grades[:midterm]
      final = grades[:final]

      hl = length(h)
      ht = String.to_integer(Enum.at(h, 0)) + String.to_integer(Enum.at(h, 1)) + String.to_integer(Enum.at(h, 2)) + String.to_integer(Enum.at(h, 3))

      ll = length(labs)
      lt = String.to_integer(Enum.at(labs,0))+String.to_integer(Enum.at(labs,1))+String.to_integer(Enum.at(labs,2))+String.to_integer(Enum.at(labs,3))+String.to_integer(Enum.at(labs,4))+String.to_integer(Enum.at(labs,5))

      total = (ht/hl)*0.15 + (lt/ll)*0.3 + String.to_integer(mid)*0.25 + String.to_integer(final)*0.3
      total
    end

    def letter_grade(grades) do
      note = percentage_grade(grades)
      cond do
        note > 90 -> "A+"
        note > 85 -> "A"
        note > 80 -> "A-"
        note > 75 -> "B+"
        note > 70 -> "B"
        note > 65 -> "B-"
        note > 60 -> "C+"
        note > 55 -> "C"
        note > 50 -> "C-"
        note > 45 -> "D+"
        note > 40 -> "D"
        note > 35 -> "D-"
        true -> "F"
      end
    end

    def numeric_grade(grades) do
      note = percentage_grade(grades)
      cond do
        note > 90 -> "10"
        note > 85 -> "9"
        note > 80 -> "8.5"
        note > 75 -> "8"
        note > 70 -> "7.5"
        note > 65 -> "7"
        note > 60 -> "6.5"
        note > 55 -> "6"
        note > 50 -> "5.5"
        note > 45 -> "5"
        note > 40 -> "4.5"
        note > 35 -> "4"
        note > 30 -> "3.5"
        note > 25 -> "3"
        note > 20 -> "2.5"
        note > 15 -> "2"
        note > 10 -> "1.5"
        note > 5 -> "1"
        note > 0 -> "0.5"
        true -> "0"
      end
    end
  end

end
