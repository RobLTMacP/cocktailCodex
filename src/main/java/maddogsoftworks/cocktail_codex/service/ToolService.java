package maddogsoftworks.cocktail_codex.service;

import maddogsoftworks.cocktail_codex.model.Tool;
import maddogsoftworks.cocktail_codex.repository.ToolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToolService {

    private final ToolRepository toolRepository;

    public ToolService(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }

    // Create
    public Tool createNewTool(Tool newTool) {
        return toolRepository.save(newTool);
    }

    // Read
    public List<Tool> getAllTools() {
        return toolRepository.findAll();
    }

    public Optional<Tool> findToolById(Integer id) {
        return toolRepository.findById(id);
    }

    // Update
    public Tool update(Integer id, Tool updatedTool) {
        Optional<Tool> existingTool = toolRepository.findById(id);
        if (existingTool.isPresent()) {
            updatedTool.setId(id);
            return toolRepository.save(updatedTool);
        }
        return null;
    }

    // Delete
    public void deleteTool(Integer id) {
        toolRepository.deleteById(id);
    }
}
