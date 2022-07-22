package controller;


import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.CategoryService;
import service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService = new ProductService();
    private CategoryService categoryService = new CategoryService();

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("category", categoryService.findAll());
        return "/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product, @RequestParam int cat) {
        product.setCategory(categoryService.findById(cat));
        productService.save(product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product",productService.findById(id));
        model.addAttribute("category",categoryService.findAll());
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product, @RequestParam int cat) {
        product.setCategory(categoryService.findById(cat));
        productService.update(product.getIdP(), product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("category",categoryService.findAll());
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int idP,Product product, RedirectAttributes redirect) {
        product.setCategory(categoryService.findById(idP));
        productService.remove(idP);
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/product";
    }

    @PostMapping("/search")
    public String search (@RequestParam String search, Model model) {
        List<Product> products = productService.SearchName(search);
        model.addAttribute("product",products);
        return "/search";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }
    
}
