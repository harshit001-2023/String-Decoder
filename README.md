# String-Decoder

A lightweight and efficient library for decoding strings using various algorithms and techniques. This repository is designed to simplify the process of decoding encoded strings, making it easier for developers to work with data in different formats.

## Features

- Supports multiple decoding algorithms (Base64, Hex, URL, etc.)
- Simple and intuitive API
- Fast and reliable performance
- Easily extensible for custom decoding methods
- Well-documented functions for ease of use

## Installation

Clone the repository:

```bash
git clone https://github.com/harshit001-2023/String-Decoder.git
```

Or install via your package manager (if available):

```bash
npm install string-decoder
# or
pip install string-decoder
```

## Usage

Below is a basic example of how to use the String-Decoder library:

### Python Example

```python
from string_decoder import decode

decoded_string = decode("SGVsbG8gd29ybGQ=", method="base64")
print(decoded_string)  # Output: Hello world
```

### JavaScript Example

```javascript
const { decode } = require('string-decoder');

const decodedString = decode('48656c6c6f20776f726c64', 'hex');
console.log(decodedString); // Output: Hello world
```

## Supported Algorithms

- Base64
- Hexadecimal
- URL Encoding
- Custom (Extendable by users)

## API Reference

### `decode(input, method)`

- `input` (str): The encoded string to decode.
- `method` (str): The decoding algorithm to use (`base64`, `hex`, `url`, etc.).

Returns the decoded string.

## Contributing

Contributions are welcome! Please open issues or submit pull requests for new features, bug fixes, or improvements.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Author

Created by [harshit001-2023](https://github.com/harshit001-2023)

---

Feel free to reach out for questions, suggestions, or collaboration!
