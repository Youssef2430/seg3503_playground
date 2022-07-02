defmodule Grades do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """

  defmodule Calculator do
    def percentage_grade(grades) do
      Enum.random(0..100)
    end

    def letter_grade(grades) do
      note = Enum.random(0..100)
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
      note = Enum.random(0..100)
      cond do
        note > 90 -> "100"
        note > 85 -> "90"
        note > 80 -> "85"
        note > 75 -> "80"
        note > 70 -> "75"
        note > 65 -> "70"
        note > 60 -> "65"
        note > 55 -> "60"
        note > 50 -> "55"
        note > 45 -> "50"
        note > 40 -> "45"
        note > 35 -> "40"
        note > 30 -> "35"
        note > 25 -> "30"
        note > 20 -> "25"
        note > 15 -> "20"
        note > 10 -> "15"
        note > 5 -> "10"
        note > 0 -> "5"
        true -> "0"
      end
    end
  end

end

defmodule Calculator do
  def percentage_grade() do
    Enum.random(0..100)
  end

  def letter_grade() do
    note = Enum.random(0..100)
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

  def numeric_grade() do
    note = Enum.random(0..100)
    cond do
      note > 90 -> "100"
      note > 85 -> "90"
      note > 80 -> "85"
      note > 75 -> "80"
      note > 70 -> "75"
      note > 65 -> "70"
      note > 60 -> "65"
      note > 55 -> "60"
      note > 50 -> "55"
      note > 45 -> "50"
      note > 40 -> "45"
      note > 35 -> "40"
      note > 30 -> "35"
      note > 25 -> "30"
      note > 20 -> "25"
      note > 15 -> "20"
      note > 10 -> "15"
      note > 5 -> "10"
      note > 0 -> "5"
      true -> "0"
    end
  end
end
