function love.load()
  love.window.setTitle("Theme OS — Mario Theme")
  love.window.setMode(800, 600)
  font = love.graphics.newFont(24)
  small = love.graphics.newFont(14)
end

function love.draw()
  -- sky background
  love.graphics.clear(0.306, 0.761, 0.969) -- #4fc3f7
  love.graphics.setFont(font)
  love.graphics.setColor(0.776, 0.157, 0.157) -- #c62828
  love.graphics.printf("🍄 Theme OS — Mario Theme", 0, 20, love.graphics.getWidth(), "center")
  love.graphics.setFont(small)
  love.graphics.setColor(1, 0.831, 0.31) -- #ffd54f
  love.graphics.printf("Trial Version — 10 days", 0, 60, love.graphics.getWidth(), "center")

  -- ground blocks
  local bw = 60
  for i = 0, 12 do
    love.graphics.setColor(1,1,1,0.9)
    love.graphics.rectangle("fill", i*bw + 10, 480, bw-6, 80, 6, 6)
    love.graphics.setColor(0.2,0.2,0.2,0.06)
    love.graphics.rectangle("line", i*bw + 10, 480, bw-6, 80, 6, 6)
  end

  -- mario sprite placeholder (emoji)
  love.graphics.setColor(1,1,1)
  love.graphics.printf("👨‍🚀🍄", love.graphics.getWidth()/2 - 30, 420, 60, "center")
end
