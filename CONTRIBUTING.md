# Contributing Guidelines

Thank you for your interest in contributing to our Hacktoberfest Data Structures & Algorithms repository! 🎉

## 📋 Table of Contents

- [Getting Started](#getting-started)
- [How to Contribute](#how-to-contribute)
- [Code Standards](#code-standards)
- [Pull Request Process](#pull-request-process)
- [Issue Guidelines](#issue-guidelines)
- [Community Guidelines](#community-guidelines)

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have:

- [ ] A GitHub account
- [ ] Git installed on your local machine
- [ ] Basic knowledge of at least one programming language from our supported languages
- [ ] Understanding of data structures and algorithms (beginner level is fine!)

### Setting Up Your Development Environment

1. **Fork the repository**

   - Click the "Fork" button on the top right of the repository page
   - This creates a copy of the repository in your GitHub account

2. **Clone your fork**

   ```bash
   git clone https://github.com/YOUR_USERNAME/Hacktoberfest-Beginners.git
   cd Hacktoberfest-Beginners
   ```

3. **Add upstream remote**
   ```bash
   git remote add upstream https://github.com/ORIGINAL_OWNER/Hacktoberfest-Beginners.git
   ```

## 🤝 How to Contribute

### 1. Choose What to Work On

You can contribute in several ways:

- **Add new algorithm implementations** in any supported language
- **Improve existing code** with better solutions or optimizations
- **Add test cases** for existing implementations
- **Fix bugs** or improve code readability
- **Add documentation** or comments
- **Suggest new problems** via issues

### 2. Supported Languages

We accept contributions in the following languages:

- **Java** (`.java`)
- **Python** (`.py`)
- **JavaScript** (`.js`)
- **TypeScript** (`.ts`)
- **C++** (`.cpp`, `.cc`, `.cxx`)
- **C#** (`.cs`)
- **Go** (`.go`)
- **Rust** (`.rs`)

### 3. File Organization

```
Language_Folder/
├── ProblemName.ext
├── AnotherProblem.ext
└── ...
```

**Naming Convention:**

- Use PascalCase for problem names: `TwoSum.java`, `BinarySearch.py`
- Use descriptive names: `LinkedListCycle.js`, `MergeTwoSortedLists.cpp`

## 📝 Code Standards

### General Guidelines

1. **Write clean, readable code**
2. **Add meaningful comments** explaining your approach
3. **Include time and space complexity** in comments
4. **Use descriptive variable names**
5. **Follow language-specific conventions**

### Code Template

Here's a template for your solutions:

```python
# Problem: [Problem Name]
# Difficulty: [Easy/Medium/Hard]
# Time Complexity: O(?)
# Space Complexity: O(?)

"""
Problem Description:
[Brief description of the problem]

Example:
Input: [example input]
Output: [example output]
"""

def solution_function():
    """
    Approach:
    [Brief explanation of your approach]
    """
    # Your implementation here
    pass

# Test cases
if __name__ == "__main__":
    # Add test cases here
    pass
```

### Language-Specific Guidelines

#### Java

- Use proper package structure
- Include Javadoc comments for methods
- Follow Java naming conventions (camelCase for variables, PascalCase for classes)

#### Python

- Follow PEP 8 style guide
- Use type hints where appropriate
- Include docstrings for functions

#### JavaScript/TypeScript

- Use modern ES6+ features
- Include JSDoc comments
- Use const/let instead of var

#### C++

- Use meaningful variable names
- Include necessary headers
- Add comments for complex logic

## 🔄 Pull Request Process

### Before Submitting

1. **Check existing implementations**

   - Make sure your solution doesn't already exist
   - If it exists, ensure your solution offers something new (better complexity, different approach)

2. **Test your code**

   - Include test cases
   - Verify your solution works correctly
   - Check edge cases

3. **Update documentation** (if applicable)
   - Update README.md if adding new problem categories
   - Add yourself to CONTRIBUTORS.md

### Creating a Pull Request

1. **Commit your changes**

   ```bash
   git add .
   git commit -m "Add [Problem Name] solution in [Language]"
   git push origin main
   ```

2. **Create the Pull Request**
   - Go to your fork on GitHub
   - Click "New Pull Request"
   - Fill out the PR template
   - Submit the PR

### PR Template

When creating a PR, please include:

```markdown
## Description

Brief description of what you've implemented or improved.

## Type of Change

- [ ] New algorithm implementation
- [ ] Code improvement/optimization
- [ ] Bug fix
- [ ] Documentation update
- [ ] Test cases addition

## Language

- [ ] Java
- [ ] Python
- [ ] JavaScript
- [ ] TypeScript
- [ ] C++
- [ ] C#
- [ ] Go
- [ ] Rust

## Problem Category

- [ ] Arrays & Strings
- [ ] Linked Lists
- [ ] Trees & Graphs
- [ ] Sorting & Searching
- [ ] Dynamic Programming
- [ ] Other (please specify)

## Time/Space Complexity

- Time Complexity: O(?)
- Space Complexity: O(?)

## Testing

- [ ] I have tested my solution
- [ ] I have included test cases
- [ ] My solution handles edge cases

## Additional Notes

Any additional information about your implementation.
```

## 🐛 Issue Guidelines

### Before Creating an Issue

1. **Check existing issues** to avoid duplicates
2. **Search closed issues** to see if it was already resolved

### Creating Issues

Use our issue templates:

**For Bug Reports:**

- Describe the bug clearly
- Provide steps to reproduce
- Include expected vs actual behavior

**For Feature Requests:**

- Describe the feature you'd like
- Explain why it would be beneficial
- Provide examples if possible

**For Algorithm Requests:**

- Describe the problem
- Provide examples
- Mention difficulty level

## 👥 Community Guidelines

### Communication

- **Be respectful** and inclusive
- **Help others** learn and grow
- **Provide constructive feedback**
- **Ask questions** when you need help

### Getting Help

- Check existing issues and discussions
- Ask questions in issue comments
- Join community discussions
- Follow our Code of Conduct

## 🏆 Recognition

All contributors will be:

- Listed in our CONTRIBUTORS.md file
- Recognized in release notes
- Eligible for Hacktoberfest swag (if participating)

## 📞 Questions?

If you have any questions about contributing:

- Open an issue with the "question" label
- Check our FAQ in discussions
- Reach out to maintainers

## 🎉 Thank You!

Thank you for contributing to open source! Every contribution, no matter how small, makes a difference. Happy coding! 🚀

---

**Remember:** This is a learning repository. Don't worry about making mistakes - we're all here to learn and grow together!
