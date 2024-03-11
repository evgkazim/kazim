package ru.kazim.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json;charset=UTF-8")
public class PochtaController {
    @GetMapping(value = "/1.0/settings/short")
    public String get1() {
        return "{\n" +
                "  \"account-admin\": true,\n" +
                "  \"account-declaration-enabled\": true,\n" +
                "  \"account-erl-enabled\": true,\n" +
                "  \"account-esignature-enabled\": true,\n" +
                "  \"accounts\": [\n" +
                "    {\n" +
                "      \"address\": \"string\",\n" +
                "      \"blocked\": true,\n" +
                "      \"email\": \"string\",\n" +
                "      \"is-admin\": true,\n" +
                "      \"legal-hid\": \"string\",\n" +
                "      \"org-inn\": \"string\",\n" +
                "      \"org-name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"address\": {\n" +
                "    \"address-type\": \"DEFAULT\",\n" +
                "    \"area\": \"string\",\n" +
                "    \"building\": \"string\",\n" +
                "    \"corpus\": \"string\",\n" +
                "    \"hotel\": \"string\",\n" +
                "    \"house\": \"string\",\n" +
                "    \"index\": \"string\",\n" +
                "    \"letter\": \"string\",\n" +
                "    \"location\": \"string\",\n" +
                "    \"manual-address-input\": true,\n" +
                "    \"num-address-type\": \"string\",\n" +
                "    \"office\": \"string\",\n" +
                "    \"place\": \"string\",\n" +
                "    \"region\": \"string\",\n" +
                "    \"room\": \"string\",\n" +
                "    \"slash\": \"string\",\n" +
                "    \"street\": \"string\",\n" +
                "    \"vladenie\": \"string\"\n" +
                "  },\n" +
                "  \"address-book-enabled\": true,\n" +
                "  \"address-change-enabled\": true,\n" +
                "  \"admin-hid\": \"string\",\n" +
                "  \"agreement-date\": \"string\",\n" +
                "  \"agreement-kind\": \"CONTRACT\",\n" +
                "  \"agreement-number\": \"string\",\n" +
                "  \"agreement-version\": \"string\",\n" +
                "  \"api_enabled\": true,\n" +
                "  \"apig_access_token\": \"string\",\n" +
                "  \"available-shipping-points\": [\n" +
                "    {\n" +
                "      \"additional-operator-postcode\": \"string\",\n" +
                "      \"additional-operator-postcodes\": [\n" +
                "        \"string\"\n" +
                "      ],\n" +
                "      \"available-additional-operator-postcodes\": [\n" +
                "        \"string\"\n" +
                "      ],\n" +
                "      \"available-mail-types\": [\n" +
                "        \"UNDEFINED\"\n" +
                "      ],\n" +
                "      \"available-products\": [\n" +
                "        {\n" +
                "          \"mail-category\": \"SIMPLE\",\n" +
                "          \"mail-type\": \"UNDEFINED\",\n" +
                "          \"product-type\": \"LETTER_ORDERED\",\n" +
                "          \"sms-notice-recipient-enabled\": true\n" +
                "        }\n" +
                "      ],\n" +
                "      \"available-return-addresses\": [\n" +
                "        {\n" +
                "          \"address\": {\n" +
                "            \"address-type\": \"DEFAULT\",\n" +
                "            \"area\": \"string\",\n" +
                "            \"building\": \"string\",\n" +
                "            \"corpus\": \"string\",\n" +
                "            \"hotel\": \"string\",\n" +
                "            \"house\": \"string\",\n" +
                "            \"index\": \"string\",\n" +
                "            \"letter\": \"string\",\n" +
                "            \"location\": \"string\",\n" +
                "            \"manual-address-input\": true,\n" +
                "            \"num-address-type\": \"string\",\n" +
                "            \"office\": \"string\",\n" +
                "            \"place\": \"string\",\n" +
                "            \"region\": \"string\",\n" +
                "            \"room\": \"string\",\n" +
                "            \"slash\": \"string\",\n" +
                "            \"street\": \"string\",\n" +
                "            \"vladenie\": \"string\"\n" +
                "          },\n" +
                "          \"return-address-id\": 0\n" +
                "        }\n" +
                "      ],\n" +
                "      \"courier-call\": true,\n" +
                "      \"enabled\": true,\n" +
                "      \"operator-postcode\": \"string\",\n" +
                "      \"ops-address\": \"string\",\n" +
                "      \"po-box\": \"string\",\n" +
                "      \"pre-postal-preparation\": true,\n" +
                "      \"return-address\": {\n" +
                "        \"address\": {\n" +
                "          \"address-type\": \"DEFAULT\",\n" +
                "          \"area\": \"string\",\n" +
                "          \"building\": \"string\",\n" +
                "          \"corpus\": \"string\",\n" +
                "          \"hotel\": \"string\",\n" +
                "          \"house\": \"string\",\n" +
                "          \"index\": \"string\",\n" +
                "          \"letter\": \"string\",\n" +
                "          \"location\": \"string\",\n" +
                "          \"manual-address-input\": true,\n" +
                "          \"num-address-type\": \"string\",\n" +
                "          \"office\": \"string\",\n" +
                "          \"place\": \"string\",\n" +
                "          \"region\": \"string\",\n" +
                "          \"room\": \"string\",\n" +
                "          \"slash\": \"string\",\n" +
                "          \"street\": \"string\",\n" +
                "          \"vladenie\": \"string\"\n" +
                "        },\n" +
                "        \"return-address-id\": 0\n" +
                "      },\n" +
                "      \"return-address-type\": \"SENDER_ADDRESS\",\n" +
                "      \"user-available-mail-types\": [\n" +
                "        \"UNDEFINED\"\n" +
                "      ],\n" +
                "      \"user-available-products\": [\n" +
                "        {\n" +
                "          \"mail-category\": \"SIMPLE\",\n" +
                "          \"mail-type\": \"UNDEFINED\",\n" +
                "          \"product-type\": \"LETTER_ORDERED\",\n" +
                "          \"sms-notice-recipient-enabled\": true\n" +
                "        }\n" +
                "      ],\n" +
                "      \"user-return-address\": {\n" +
                "        \"address-type\": \"DEFAULT\",\n" +
                "        \"area\": \"string\",\n" +
                "        \"building\": \"string\",\n" +
                "        \"corpus\": \"string\",\n" +
                "        \"hotel\": \"string\",\n" +
                "        \"house\": \"string\",\n" +
                "        \"index\": \"string\",\n" +
                "        \"letter\": \"string\",\n" +
                "        \"location\": \"string\",\n" +
                "        \"manual-address-input\": true,\n" +
                "        \"num-address-type\": \"string\",\n" +
                "        \"office\": \"string\",\n" +
                "        \"place\": \"string\",\n" +
                "        \"region\": \"string\",\n" +
                "        \"room\": \"string\",\n" +
                "        \"slash\": \"string\",\n" +
                "        \"street\": \"string\",\n" +
                "        \"vladenie\": \"string\"\n" +
                "      },\n" +
                "      \"vsd-enabled\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"blocked\": true,\n" +
                "  \"branch-name\": \"string\",\n" +
                "  \"branch-names\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"brand-name\": \"string\",\n" +
                "  \"cargo\": true,\n" +
                "  \"client-category\": \"FEDERAL\",\n" +
                "  \"codLending\": true,\n" +
                "  \"contact-email\": \"string\",\n" +
                "  \"contact-phone\": 0,\n" +
                "  \"courier-template-enable\": true,\n" +
                "  \"customs-code\": \"string\",\n" +
                "  \"declaration-enabled\": true,\n" +
                "  \"def-envelope-type\": \"C4\",\n" +
                "  \"def-payment-method\": \"CASHLESS\",\n" +
                "  \"delivery_with-cod_enabled\": true,\n" +
                "  \"direct-addition-to-batch-enabled\": true,\n" +
                "  \"earning-category\": \"VIP\",\n" +
                "  \"easy-return\": true,\n" +
                "  \"ems-tender-payment-enabled\": true,\n" +
                "  \"erl-agreement-date\": \"string\",\n" +
                "  \"erl-agreement-number\": \"string\",\n" +
                "  \"erl-customer-id\": \"string\",\n" +
                "  \"erl-customer-token\": \"string\",\n" +
                "  \"erl-enabled\": true,\n" +
                "  \"erl-order-forms\": [\n" +
                "    {\n" +
                "      \"mail-category\": \"SIMPLE\",\n" +
                "      \"order-form-date\": \"string\",\n" +
                "      \"order-form-id\": 0,\n" +
                "      \"order-form-number\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"esignature-agreement-accepted\": true,\n" +
                "  \"esignature-enabled\": true,\n" +
                "  \"espp-cod-code\": \"string\",\n" +
                "  \"espp-code\": \"string\",\n" +
                "  \"extension-shelf-life-ecom\": true,\n" +
                "  \"farma\": true,\n" +
                "  \"fulfillment-enabled\": true,\n" +
                "  \"hid\": \"string\",\n" +
                "  \"hyper-local-delivery\": true,\n" +
                "  \"is-alcoholic-beverages\": true,\n" +
                "  \"is-cargo\": true,\n" +
                "  \"is-cod-lending\": true,\n" +
                "  \"is-farma\": true,\n" +
                "  \"is-filled-questionnaire\": true,\n" +
                "  \"legal-address\": \"string\",\n" +
                "  \"legal-hid\": \"string\",\n" +
                "  \"mail-rank\": \"WO_RANK\",\n" +
                "  \"mailing-option\": [\n" +
                "    {\n" +
                "      \"key\": \"POSTAL_PARCEL\",\n" +
                "      \"value\": [\n" +
                "        {\n" +
                "          \"key\": \"PRINT_TYPE\",\n" +
                "          \"value\": \"string\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"mmo-auto-enabled\": true,\n" +
                "  \"mmo-enabled\": true,\n" +
                "  \"online-balance-enabled\": true,\n" +
                "  \"only-signature\": true,\n" +
                "  \"org-inn\": \"string\",\n" +
                "  \"org-kpp\": \"string\",\n" +
                "  \"org-name\": \"string\",\n" +
                "  \"org-name-international\": \"string\",\n" +
                "  \"person-code\": \"string\",\n" +
                "  \"person-codes\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"planned-monthly-number\": 0,\n" +
                "  \"postal-groups\": [\n" +
                "    \"PARCELS\"\n" +
                "  ],\n" +
                "  \"print-from-backlog\": true,\n" +
                "  \"print-type\": \"PAPER\",\n" +
                "  \"product-types\": [\n" +
                "    \"LETTER_ORDERED\"\n" +
                "  ],\n" +
                "  \"raw_tel_address_enabled\": true,\n" +
                "  \"regions\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"report-version\": 0,\n" +
                "  \"sender-category\": \"PEOPLE\",\n" +
                "  \"sender-name\": \"string\",\n" +
                "  \"shipping-points\": [\n" +
                "    {\n" +
                "      \"additional-operator-postcode\": \"string\",\n" +
                "      \"additional-operator-postcodes\": [\n" +
                "        \"string\"\n" +
                "      ],\n" +
                "      \"available-additional-operator-postcodes\": [\n" +
                "        \"string\"\n" +
                "      ],\n" +
                "      \"available-mail-types\": [\n" +
                "        \"UNDEFINED\"\n" +
                "      ],\n" +
                "      \"available-products\": [\n" +
                "        {\n" +
                "          \"mail-category\": \"SIMPLE\",\n" +
                "          \"mail-type\": \"UNDEFINED\",\n" +
                "          \"product-type\": \"LETTER_ORDERED\",\n" +
                "          \"sms-notice-recipient-enabled\": true\n" +
                "        }\n" +
                "      ],\n" +
                "      \"available-return-addresses\": [\n" +
                "        {\n" +
                "          \"address\": {\n" +
                "            \"address-type\": \"DEFAULT\",\n" +
                "            \"area\": \"string\",\n" +
                "            \"building\": \"string\",\n" +
                "            \"corpus\": \"string\",\n" +
                "            \"hotel\": \"string\",\n" +
                "            \"house\": \"string\",\n" +
                "            \"index\": \"string\",\n" +
                "            \"letter\": \"string\",\n" +
                "            \"location\": \"string\",\n" +
                "            \"manual-address-input\": true,\n" +
                "            \"num-address-type\": \"string\",\n" +
                "            \"office\": \"string\",\n" +
                "            \"place\": \"string\",\n" +
                "            \"region\": \"string\",\n" +
                "            \"room\": \"string\",\n" +
                "            \"slash\": \"string\",\n" +
                "            \"street\": \"string\",\n" +
                "            \"vladenie\": \"string\"\n" +
                "          },\n" +
                "          \"return-address-id\": 0\n" +
                "        }\n" +
                "      ],\n" +
                "      \"courier-call\": true,\n" +
                "      \"enabled\": true,\n" +
                "      \"operator-postcode\": \"string\",\n" +
                "      \"ops-address\": \"string\",\n" +
                "      \"po-box\": \"string\",\n" +
                "      \"pre-postal-preparation\": true,\n" +
                "      \"return-address\": {\n" +
                "        \"address\": {\n" +
                "          \"address-type\": \"DEFAULT\",\n" +
                "          \"area\": \"string\",\n" +
                "          \"building\": \"string\",\n" +
                "          \"corpus\": \"string\",\n" +
                "          \"hotel\": \"string\",\n" +
                "          \"house\": \"string\",\n" +
                "          \"index\": \"string\",\n" +
                "          \"letter\": \"string\",\n" +
                "          \"location\": \"string\",\n" +
                "          \"manual-address-input\": true,\n" +
                "          \"num-address-type\": \"string\",\n" +
                "          \"office\": \"string\",\n" +
                "          \"place\": \"string\",\n" +
                "          \"region\": \"string\",\n" +
                "          \"room\": \"string\",\n" +
                "          \"slash\": \"string\",\n" +
                "          \"street\": \"string\",\n" +
                "          \"vladenie\": \"string\"\n" +
                "        },\n" +
                "        \"return-address-id\": 0\n" +
                "      },\n" +
                "      \"return-address-type\": \"SENDER_ADDRESS\",\n" +
                "      \"user-available-mail-types\": [\n" +
                "        \"UNDEFINED\"\n" +
                "      ],\n" +
                "      \"user-available-products\": [\n" +
                "        {\n" +
                "          \"mail-category\": \"SIMPLE\",\n" +
                "          \"mail-type\": \"UNDEFINED\",\n" +
                "          \"product-type\": \"LETTER_ORDERED\",\n" +
                "          \"sms-notice-recipient-enabled\": true\n" +
                "        }\n" +
                "      ],\n" +
                "      \"user-return-address\": {\n" +
                "        \"address-type\": \"DEFAULT\",\n" +
                "        \"area\": \"string\",\n" +
                "        \"building\": \"string\",\n" +
                "        \"corpus\": \"string\",\n" +
                "        \"hotel\": \"string\",\n" +
                "        \"house\": \"string\",\n" +
                "        \"index\": \"string\",\n" +
                "        \"letter\": \"string\",\n" +
                "        \"location\": \"string\",\n" +
                "        \"manual-address-input\": true,\n" +
                "        \"num-address-type\": \"string\",\n" +
                "        \"office\": \"string\",\n" +
                "        \"place\": \"string\",\n" +
                "        \"region\": \"string\",\n" +
                "        \"room\": \"string\",\n" +
                "        \"slash\": \"string\",\n" +
                "        \"street\": \"string\",\n" +
                "        \"vladenie\": \"string\"\n" +
                "      },\n" +
                "      \"vsd-enabled\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"show-returns\": true,\n" +
                "  \"tel-address-custom-cleaning\": true,\n" +
                "  \"template-notification-area\": \"ECP\",\n" +
                "  \"use-branch-name\": true,\n" +
                "  \"use-person-code\": true,\n" +
                "  \"user-lock-initiator-email\": \"string\",\n" +
                "  \"zoo-simple\": true\n" +
                "}";

//        return "{\n" +
//                "  \"accountAdmin\": true,\n" +
//                "  \"accountDeclarationEnabled\": false,\n" +
//                "  \"accountElectronicSignatureEnabled\": true,\n" +
//                "  \"accountErlEnabled\": false,\n" +
//                "  \"address\": \"644074, пр-кт Комарова, д.23 корп.1, г Омск, обл Омская\",\n" +
//                "  \"addressBookEnabled\": true,\n" +
//                "  \"addressChangeEnabled\": true,\n" +
//                "  \"agreementDate\": \"2017-10-11\",\n" +
//                "  \"agreementKind\": \"CONTRACT\",\n" +
//                "  \"agreementNumber\": \"7730106\",\n" +
//                "  \"alcoholicBeverages\": false,\n" +
//                "  \"apiEnabled\": true,\n" +
//                "  \"apigAccessToken\": \"pP4oLRZ5N29YsrfMriSYSs84AX8koGuE\",\n" +
//                "  \"blocked\": false,\n" +
//                "  \"branchNames\": [],\n" +
//                "  \"cargoEnabled\": true,\n" +
//                "  \"clientCategory\": \"REGIONAL\",\n" +
//                "  \"contactEmail\": \"fakedomain.com\",\n" +
//                "  \"contactPhone\": \"+7(950)444-55-11\",\n" +
//                "  \"courierTemplateEnable\": false,\n" +
//                "  \"declarationEnabled\": true,\n" +
//                "  \"deliveryWithCodEnabled\": true,\n" +
//                "  \"directAdditionToBatchEnabled\": true,\n" +
//                "  \"easyReturn\": true,\n" +
//                "  \"emsTenderPaymentEnabled\": true,\n" +
//                "  \"erlEnabled\": false,\n" +
//                "  \"esignatureAgreementAccepted\": false,\n" +
//                "  \"esignatureEnabled\": true,\n" +
//                "  \"esppCode\": \"028325\",\n" +
//                "  \"extensionShelfLifeEcom\": false,\n" +
//                "  \"farmaEnabled\": false,\n" +
//                "  \"filledQuestionnaire\": false,\n" +
//                "  \"fulfillmentEnabled\": true,\n" +
//                "  \"hyperLocalEnabled\": false,\n" +
//                "  \"legalHid\": \"15f34843-8a54-4cc7-a6a4-724a91898d61\",\n" +
//                "  \"letterSettings\": {\n" +
//                "    \"envelopeTypes\": [\n" +
//                "      {\n" +
//                "        \"code\": \"WITHOUT_ENVELOPE\",\n" +
//                "        \"forBanderols\": true,\n" +
//                "        \"forBanderolsClass1\": true,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": false,\n" +
//                "        \"forLetters\": false,\n" +
//                "        \"forLettersClass1\": false,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": false,\n" +
//                "        \"onlyForOpm\": false,\n" +
//                "        \"supportsOpm\": false,\n" +
//                "        \"text\": \"Ярлык ф.7\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"C4\",\n" +
//                "        \"forBanderols\": true,\n" +
//                "        \"forBanderolsClass1\": true,\n" +
//                "        \"forIntlBanderols\": true,\n" +
//                "        \"forIntlLetters\": true,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": true,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": true,\n" +
//                "        \"onlyForOpm\": false,\n" +
//                "        \"supportsOpm\": true,\n" +
//                "        \"text\": \"С4 (229мм x 324мм)\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"C5\",\n" +
//                "        \"forBanderols\": true,\n" +
//                "        \"forBanderolsClass1\": true,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": true,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": true,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": true,\n" +
//                "        \"onlyForOpm\": false,\n" +
//                "        \"supportsOpm\": true,\n" +
//                "        \"text\": \"С5 (162мм x 229мм)\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"C6\",\n" +
//                "        \"forBanderols\": false,\n" +
//                "        \"forBanderolsClass1\": false,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": false,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": false,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": false,\n" +
//                "        \"onlyForOpm\": false,\n" +
//                "        \"supportsOpm\": false,\n" +
//                "        \"text\": \"C6 (114мм x 162мм)\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"DL\",\n" +
//                "        \"forBanderols\": false,\n" +
//                "        \"forBanderolsClass1\": false,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": true,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": true,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": true,\n" +
//                "        \"onlyForOpm\": false,\n" +
//                "        \"supportsOpm\": true,\n" +
//                "        \"text\": \"110мм x 220мм\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"A6\",\n" +
//                "        \"forBanderols\": false,\n" +
//                "        \"forBanderolsClass1\": false,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": false,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": false,\n" +
//                "        \"forPostCard\": true,\n" +
//                "        \"forVgpoClass1\": false,\n" +
//                "        \"onlyForOpm\": false,\n" +
//                "        \"supportsOpm\": false,\n" +
//                "        \"text\": \"Стикер А6 (105мм x 148мм)\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"A7\",\n" +
//                "        \"forBanderols\": true,\n" +
//                "        \"forBanderolsClass1\": false,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": true,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": false,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": false,\n" +
//                "        \"onlyForOpm\": false,\n" +
//                "        \"supportsOpm\": false,\n" +
//                "        \"text\": \"Стикер А7 (74мм x 105мм)\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"OX\",\n" +
//                "        \"forBanderols\": true,\n" +
//                "        \"forBanderolsClass1\": true,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": false,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": true,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": false,\n" +
//                "        \"onlyForOpm\": true,\n" +
//                "        \"supportsOpm\": true,\n" +
//                "        \"text\": \"ЗОО X6 (99мм х 105мм)\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"OA\",\n" +
//                "        \"forBanderols\": true,\n" +
//                "        \"forBanderolsClass1\": true,\n" +
//                "        \"forIntlBanderols\": false,\n" +
//                "        \"forIntlLetters\": false,\n" +
//                "        \"forLetters\": true,\n" +
//                "        \"forLettersClass1\": true,\n" +
//                "        \"forPostCard\": false,\n" +
//                "        \"forVgpoClass1\": false,\n" +
//                "        \"onlyForOpm\": true,\n" +
//                "        \"supportsOpm\": true,\n" +
//                "        \"text\": \"ЗОО A6 (105мм х 148,5мм)\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"paymentMethods\": [\n" +
//                "      {\n" +
//                "        \"code\": \"STAMP\",\n" +
//                "        \"extended\": false,\n" +
//                "        \"forNotice\": true,\n" +
//                "        \"selectable\": true,\n" +
//                "        \"text\": \"Марки\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"FRANKING\",\n" +
//                "        \"extended\": false,\n" +
//                "        \"forNotice\": false,\n" +
//                "        \"selectable\": true,\n" +
//                "        \"text\": \"Франкировка\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"TO_FRANKING\",\n" +
//                "        \"extended\": true,\n" +
//                "        \"forNotice\": false,\n" +
//                "        \"selectable\": true,\n" +
//                "        \"text\": \"На франкировку\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"CASHLESS\",\n" +
//                "        \"extended\": false,\n" +
//                "        \"forNotice\": true,\n" +
//                "        \"selectable\": false,\n" +
//                "        \"text\": \"Безналичный\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"ONLINE_PAYMENT_MARK\",\n" +
//                "        \"extended\": false,\n" +
//                "        \"forNotice\": false,\n" +
//                "        \"selectable\": true,\n" +
//                "        \"text\": \"Знак онлайн оплаты\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"printForms\": [\n" +
//                "      {\n" +
//                "        \"code\": \"A4\",\n" +
//                "        \"text\": \"A4\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"F119\",\n" +
//                "        \"text\": \"Бланке\"\n" +
//                "      }\n" +
//                "    ]\n" +
//                "  },\n" +
//                "  \"mailRank\": \"JUDICIAL\",\n" +
//                "  \"mailTypes\": [\n" +
//                "    {\n" +
//                "      \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "      \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"BANDEROL_ORDERED\",\n" +
//                "      \"text\": \"Бандероль заказная\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"INTERNATIONAL_BANDEROL_ORDERED\",\n" +
//                "      \"text\": \"Бандероль международная заказная\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "      \"text\": \"Бандероль простая\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "      \"text\": \"Бандероль-комплект\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"SMALL_PACKET_ORDERED\",\n" +
//                "      \"text\": \"Мелкий пакет\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "      \"text\": \"Письмо 1 класса заказное\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"LETTER_ORDERED\",\n" +
//                "      \"text\": \"Письмо заказное\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "      \"text\": \"Письмо международное заказное\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "      \"text\": \"Письмо международное простое\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"text\": \"Письмо простое\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"POSTAL_PARCEL\",\n" +
//                "      \"text\": \"Посылка\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"code\": \"ONLINE_PARCEL\",\n" +
//                "      \"text\": \"Посылка онлайн\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"mailingOptions\": {\n" +
//                "    \"BANDEROL_ORDER_CLASS_1\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"WITHOUT_ENVELOPE\",\n" +
//                "      \"PRINT_NO_RETURN\": \"NOT_MARKED\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"VGPO_CLASS_1_ORDERED\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C5\",\n" +
//                "      \"PRINT_NO_RETURN\": \"NOT_MARKED\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"NOTICE_OF_DELIVERY\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"PRINT_FORM\": \"A4\",\n" +
//                "      \"PRINT_FORM_TYPE\": \"ONE_SIDED\"\n" +
//                "    },\n" +
//                "    \"INTERNATIONAL_LETTER_ORDERED\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C5\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"POST_CARD_SIMPLE\": {\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"A6\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"CASHLESS\"\n" +
//                "    },\n" +
//                "    \"LETTER_SIMPLE\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"GROUP_F103F\": \"NOT_GROUPED\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"A6\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"BANDEROL_ORDER\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"WITHOUT_ENVELOPE\",\n" +
//                "      \"PRINT_NO_RETURN\": \"NOT_MARKED\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"FOUR_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"EMS_GROUP\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"PRINT_TOTAL_THERMO\": \"NOT_PRINT\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"PRINT_TYPE\": \"PAPER\",\n" +
//                "      \"PRINT_TOTAL_PAPER\": \"NOT_PRINT\",\n" +
//                "      \"PRINT_TOTAL_COST\": \"PRINT\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\"\n" +
//                "    },\n" +
//                "    \"BANDEROL\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"GROUP_F103F\": \"GROUPED\",\n" +
//                "      \"PRINT_COMMENT\": \"SHOW\",\n" +
//                "      \"ENVELOPE_TYPE\": \"WITHOUT_ENVELOPE\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"LETTER_ORDER\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C4\",\n" +
//                "      \"PRINT_NO_RETURN\": \"MARKED\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"FOUR_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"BANDEROL_KIT\": {\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C4\",\n" +
//                "      \"PAYMENT_METHOD\": \"CASHLESS\"\n" +
//                "    },\n" +
//                "    \"INTERNATIONAL_BANDEROL_ORDERED\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C4\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"INTERNATIONAL_SINGLE_LETTER_SIMPLE\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C5\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"TRANSPORT_TYPE\": \"SURFACE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"LETTER_ORDER_CLASS_1\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C5\",\n" +
//                "      \"PRINT_NO_RETURN\": \"NOT_MARKED\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"VGPO_CLASS_1_SIMPLE\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"C5\",\n" +
//                "      \"PAYMENT_METHOD\": \"FRANKING\"\n" +
//                "    },\n" +
//                "    \"POST_CARD_ORDERED\": {\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"ENVELOPE_TYPE\": \"A6\",\n" +
//                "      \"PRINT_NO_RETURN\": \"NOT_MARKED\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"CASHLESS\"\n" +
//                "    },\n" +
//                "    \"POSTAL_PARCEL\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"PRINT_TOTAL_THERMO\": \"NOT_PRINT\",\n" +
//                "      \"NOTICE_PAYMENT_METHOD\": \"CASHLESS\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"PRINT_TYPE\": \"PAPER\",\n" +
//                "      \"PRINT_TOTAL_PAPER\": \"NOT_PRINT\",\n" +
//                "      \"PRINT_NO_RETURN\": \"NOT_MARKED\",\n" +
//                "      \"PRINT_F112\": \"BUILD_IN\",\n" +
//                "      \"PRINT_TOTAL_COST\": \"PRINT\",\n" +
//                "      \"PRINT_ON_PAGE_OPTION\": \"ONE_ON_PAGE\",\n" +
//                "      \"PAYMENT_METHOD\": \"CASHLESS\"\n" +
//                "    },\n" +
//                "    \"ORDERED_NOTICE_OF_DELIVERY\": {\n" +
//                "      \"PRINT_ORDER_NUM\": \"SHOW\",\n" +
//                "      \"PRINT_COMMENT\": \"HIDE\",\n" +
//                "      \"PRINT_FORM\": \"A4\",\n" +
//                "      \"PRINT_FORM_TYPE\": \"ONE_SIDED\"\n" +
//                "    }\n" +
//                "  },\n" +
//                "  \"mmoAutoEnabled\": true,\n" +
//                "  \"mmoEnabled\": true,\n" +
//                "  \"onlineBalanceEnabled\": true,\n" +
//                "  \"onlySignature\": false,\n" +
//                "  \"opmSimpleEnabled\": true,\n" +
//                "  \"orgInn\": \"550666885512\",\n" +
//                "  \"orgName\": \"ИП Морозова Елена Ивановна\",\n" +
//                "  \"organizations\": [\n" +
//                "    {\n" +
//                "      \"blocked\": false,\n" +
//                "      \"legalHid\": \"15f34843-8a54-4cc7-a6a4-724a91898d61\",\n" +
//                "      \"orgName\": \"ИП Морозова Елена Ивановна\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"personCode\": \"123456789\",\n" +
//                "  \"personCodes\": [],\n" +
//                "  \"postalGroups\": [\n" +
//                "    \"LETTERS\"\n" +
//                "  ],\n" +
//                "  \"ppKitEnabled\": true,\n" +
//                "  \"printFromBacklog\": false,\n" +
//                "  \"rawTelAddressEnabled\": true,\n" +
//                "  \"regions\": [\n" +
//                "    \"773\"\n" +
//                "  ],\n" +
//                "  \"reportVersion\": 2,\n" +
//                "  \"senderName\": \"Самый гуманный суд на свете\",\n" +
//                "  \"showReturns\": false,\n" +
//                "  \"smsNoticeAvailable\": true,\n" +
//                "  \"smsNoticeRecipientEnableds\": {\n" +
//                "    \"SINGLE_LETTER_SIMPLE\": false,\n" +
//                "    \"HYPER_CARGO\": false,\n" +
//                "    \"LETTER_CLASS_1_ORDERED\": true,\n" +
//                "    \"INTERNATIONAL_POSTAL_PARCEL\": true,\n" +
//                "    \"EMS_TENDER\": true,\n" +
//                "    \"BANDEROL_CLASS_1_ORDERED\": true,\n" +
//                "    \"VGPO_CLASS_1_SIMPLE\": false,\n" +
//                "    \"BANDEROL_ORDERED\": false,\n" +
//                "    \"PARCEL_CLASS_1\": true,\n" +
//                "    \"POSTAL_PARCEL\": true,\n" +
//                "    \"EMS_OPTIMAL\": true,\n" +
//                "    \"EMS\": true,\n" +
//                "    \"BANDEROL_KIT_ORDERED\": false,\n" +
//                "    \"EMS_RT\": false,\n" +
//                "    \"ONLINE_PARCEL\": true,\n" +
//                "    \"EASY_RETURN\": false,\n" +
//                "    \"POST_CARD_ORDERED\": false,\n" +
//                "    \"INTERNATIONAL_LETTER_ORDERED\": false,\n" +
//                "    \"POST_CARD_SIMPLE\": false,\n" +
//                "    \"INTERNATIONAL_BANDEROL_ORDERED\": false,\n" +
//                "    \"SINGLE_BANDEROL_SIMPLE\": false,\n" +
//                "    \"BUSINESS_COURIER_ES\": false,\n" +
//                "    \"ONLINE_COURIER\": true,\n" +
//                "    \"INTERNATIONAL_LETTER_SIMPLE\": false,\n" +
//                "    \"ECOM\": true,\n" +
//                "    \"BUSINESS_COURIER\": false,\n" +
//                "    \"INTERNATIONAL_EMS_ORDINARY\": true,\n" +
//                "    \"ECOM_MARKETPLACE\": true,\n" +
//                "    \"SMALL_PACKET_ORDERED\": false,\n" +
//                "    \"VGPO_CLASS_1_ORDERED\": false,\n" +
//                "    \"LETTER_ORDERED\": false,\n" +
//                "    \"LETTER_SIMPLE\": false,\n" +
//                "    \"BANDEROL_SIMPLE\": false\n" +
//                "  },\n" +
//                "  \"useBranchName\": false,\n" +
//                "  \"usePersonCode\": false,\n" +
//                "  \"userId\": \"15dbb2c1-e2b5-4e35-8aab-52c7051495f9\",\n" +
//                "  \"vipAB\": false\n" +
//                "}";
    }
    @GetMapping(value = "/1.0/settings/shipping-point")
    public String get2() {
        return "[\n" +
                "  {\n" +
                "    \"additional-operator-postcode\": \"string\",\n" +
                "    \"additional-operator-postcodes\": [\n" +
                "      \"string\"\n" +
                "    ],\n" +
                "    \"available-additional-operator-postcodes\": [\n" +
                "      \"string\"\n" +
                "    ],\n" +
                "    \"available-mail-types\": [\n" +
                "      \"UNDEFINED\"\n" +
                "    ],\n" +
                "    \"available-products\": [\n" +
                "      {\n" +
                "        \"mail-category\": \"SIMPLE\",\n" +
                "        \"mail-type\": \"UNDEFINED\",\n" +
                "        \"product-type\": \"LETTER_ORDERED\",\n" +
                "        \"sms-notice-recipient-enabled\": true\n" +
                "      }\n" +
                "    ],\n" +
                "    \"available-return-addresses\": [\n" +
                "      {\n" +
                "        \"address\": {\n" +
                "          \"address-type\": \"DEFAULT\",\n" +
                "          \"area\": \"string\",\n" +
                "          \"building\": \"string\",\n" +
                "          \"corpus\": \"string\",\n" +
                "          \"hotel\": \"string\",\n" +
                "          \"house\": \"string\",\n" +
                "          \"index\": \"string\",\n" +
                "          \"letter\": \"string\",\n" +
                "          \"location\": \"string\",\n" +
                "          \"manual-address-input\": true,\n" +
                "          \"num-address-type\": \"string\",\n" +
                "          \"office\": \"string\",\n" +
                "          \"place\": \"string\",\n" +
                "          \"region\": \"string\",\n" +
                "          \"room\": \"string\",\n" +
                "          \"slash\": \"string\",\n" +
                "          \"street\": \"string\",\n" +
                "          \"vladenie\": \"string\"\n" +
                "        },\n" +
                "        \"return-address-id\": 0\n" +
                "      }\n" +
                "    ],\n" +
                "    \"courier-call\": true,\n" +
                "    \"enabled\": true,\n" +
                "    \"operator-postcode\": \"string\",\n" +
                "    \"ops-address\": \"string\",\n" +
                "    \"po-box\": \"string\",\n" +
                "    \"pre-postal-preparation\": true,\n" +
                "    \"return-address\": {\n" +
                "      \"address\": {\n" +
                "        \"address-type\": \"DEFAULT\",\n" +
                "        \"area\": \"string\",\n" +
                "        \"building\": \"string\",\n" +
                "        \"corpus\": \"string\",\n" +
                "        \"hotel\": \"string\",\n" +
                "        \"house\": \"string\",\n" +
                "        \"index\": \"string\",\n" +
                "        \"letter\": \"string\",\n" +
                "        \"location\": \"string\",\n" +
                "        \"manual-address-input\": true,\n" +
                "        \"num-address-type\": \"string\",\n" +
                "        \"office\": \"string\",\n" +
                "        \"place\": \"string\",\n" +
                "        \"region\": \"string\",\n" +
                "        \"room\": \"string\",\n" +
                "        \"slash\": \"string\",\n" +
                "        \"street\": \"string\",\n" +
                "        \"vladenie\": \"string\"\n" +
                "      },\n" +
                "      \"return-address-id\": 0\n" +
                "    },\n" +
                "    \"return-address-type\": \"SENDER_ADDRESS\",\n" +
                "    \"user-available-mail-types\": [\n" +
                "      \"UNDEFINED\"\n" +
                "    ],\n" +
                "    \"user-available-products\": [\n" +
                "      {\n" +
                "        \"mail-category\": \"SIMPLE\",\n" +
                "        \"mail-type\": \"UNDEFINED\",\n" +
                "        \"product-type\": \"LETTER_ORDERED\",\n" +
                "        \"sms-notice-recipient-enabled\": true\n" +
                "      }\n" +
                "    ],\n" +
                "    \"user-return-address\": {\n" +
                "      \"address-type\": \"DEFAULT\",\n" +
                "      \"area\": \"string\",\n" +
                "      \"building\": \"string\",\n" +
                "      \"corpus\": \"string\",\n" +
                "      \"hotel\": \"string\",\n" +
                "      \"house\": \"string\",\n" +
                "      \"index\": \"string\",\n" +
                "      \"letter\": \"string\",\n" +
                "      \"location\": \"string\",\n" +
                "      \"manual-address-input\": true,\n" +
                "      \"num-address-type\": \"string\",\n" +
                "      \"office\": \"string\",\n" +
                "      \"place\": \"string\",\n" +
                "      \"region\": \"string\",\n" +
                "      \"room\": \"string\",\n" +
                "      \"slash\": \"string\",\n" +
                "      \"street\": \"string\",\n" +
                "      \"vladenie\": \"string\"\n" +
                "    },\n" +
                "    \"vsd-enabled\": true\n" +
                "  }\n" +
                "]";

//        return "[\n" +
//                "  {\n" +
//                "    \"additionalOperatorPostcodes\": [\n" +
//                "      \"101000\"\n" +
//                "    ],\n" +
//                "    \"availableProducts\": [\n" +
//                "      \"INTERNATIONAL_SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "      \"BANDEROL_ORDERED\",\n" +
//                "      \"POSTAL_PARCEL_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_CLASS_1_ORDERED\",\n" +
//                "      \"ONLINE_PARCEL_WITH_DECLARED_VALUE_AND_COMPULSORY_PAYMENT\",\n" +
//                "      \"ONLINE_PARCEL_WITH_DECLARED_VALUE\",\n" +
//                "      \"LETTER_ORDERED\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"BANDEROL_KIT_ORDERED\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE\",\n" +
//                "      \"POSTAL_PARCEL_ORDINARY\",\n" +
//                "      \"POSTAL_PARCEL_WITH_DECLARED_VALUE_AND_COMPULSORY_PAYMENT\",\n" +
//                "      \"ONLINE_PARCEL_COMBINED_ORDINARY\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"ONLINE_PARCEL_COMBINED_WITH_DECLARED_VALUE\",\n" +
//                "      \"ONLINE_PARCEL_ORDINARY\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "      \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"ONLINE_PARCEL_COMBINED_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"POSTAL_PARCEL_WITH_DECLARED_VALUE\",\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE\",\n" +
//                "      \"ONLINE_PARCEL_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\"\n" +
//                "    ],\n" +
//                "    \"availableReturnAddresses\": [\n" +
//                "      {\n" +
//                "        \"code\": \"2695\",\n" +
//                "        \"text\": \"105342, москва, варшавское шоссе, 37\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMailTypes\": [\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"POSTAL_PARCEL\",\n" +
//                "        \"text\": \"Посылка\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"ONLINE_PARCEL\",\n" +
//                "        \"text\": \"Посылка онлайн\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMmoMailTypes\": [],\n" +
//                "    \"courierCall\": false,\n" +
//                "    \"currentReturnAddress\": \"105342, москва, варшавское шоссе, 37\",\n" +
//                "    \"enabled\": true,\n" +
//                "    \"hasOnlyLetterTypes\": false,\n" +
//                "    \"mailTypes\": [\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"POSTAL_PARCEL\",\n" +
//                "        \"text\": \"Посылка\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"ONLINE_PARCEL\",\n" +
//                "        \"text\": \"Посылка онлайн\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"operatorPostcode\": \"101000\",\n" +
//                "    \"opsAddress\": \"ул Мясницкая, д.26, кв.2, г Москва\",\n" +
//                "    \"poBoxChecked\": false,\n" +
//                "    \"postalOperator\": {\n" +
//                "      \"code\": \"101000\",\n" +
//                "      \"text\": \"101000 - ул Мясницкая, д.26, кв.2, г Москва\"\n" +
//                "    },\n" +
//                "    \"prePostalPreparation\": false,\n" +
//                "    \"returnAddressType\": \"SENDER_ADDRESS\",\n" +
//                "    \"selectedReturnAddressId\": 2695,\n" +
//                "    \"terminalDeliveryAvailable\": false,\n" +
//                "    \"vsdEnabled\": false\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"additionalOperatorPostcodes\": [\n" +
//                "      \"800000\"\n" +
//                "    ],\n" +
//                "    \"availableProducts\": [\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE\",\n" +
//                "      \"INTERNATIONAL_SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"BANDEROL_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"LETTER_ORDERED\",\n" +
//                "      \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "      \"SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_KIT_ORDERED\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE\"\n" +
//                "    ],\n" +
//                "    \"availableReturnAddresses\": [],\n" +
//                "    \"checkableMailTypes\": [\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMmoMailTypes\": [],\n" +
//                "    \"courierCall\": false,\n" +
//                "    \"enabled\": true,\n" +
//                "    \"hasOnlyLetterTypes\": true,\n" +
//                "    \"mailTypes\": [\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"operatorPostcode\": \"125993\",\n" +
//                "    \"opsAddress\": \"проезд Войковский 4-й, д.10, г Москва\",\n" +
//                "    \"poBoxChecked\": false,\n" +
//                "    \"postalOperator\": {\n" +
//                "      \"code\": \"125993\",\n" +
//                "      \"text\": \"125993 - проезд Войковский 4-й, д.10, г Москва\"\n" +
//                "    },\n" +
//                "    \"prePostalPreparation\": false,\n" +
//                "    \"returnAddressType\": \"POSTOFFICE_ADDRESS\",\n" +
//                "    \"terminalDeliveryAvailable\": false,\n" +
//                "    \"vsdEnabled\": false\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"additionalOperatorPostcodes\": [\n" +
//                "      \"800000\"\n" +
//                "    ],\n" +
//                "    \"availableProducts\": [\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE\",\n" +
//                "      \"INTERNATIONAL_SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"INTERNATIONAL_BANDEROL_ORDERED\",\n" +
//                "      \"BANDEROL_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"LETTER_ORDERED\",\n" +
//                "      \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "      \"SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_KIT_ORDERED\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE\"\n" +
//                "    ],\n" +
//                "    \"availableReturnAddresses\": [\n" +
//                "      {\n" +
//                "        \"code\": \"2694\",\n" +
//                "        \"text\": \"115124, москва, варшавское шоссе, 37\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMailTypes\": [\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль международная заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMmoMailTypes\": [],\n" +
//                "    \"courierCall\": false,\n" +
//                "    \"enabled\": true,\n" +
//                "    \"hasOnlyLetterTypes\": true,\n" +
//                "    \"mailTypes\": [\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль международная заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"operatorPostcode\": \"153774\",\n" +
//                "    \"opsAddress\": \"ш Варшавское, д.37, Москва\",\n" +
//                "    \"poBoxChecked\": false,\n" +
//                "    \"postalOperator\": {\n" +
//                "      \"code\": \"153774\",\n" +
//                "      \"text\": \"153774 - ш Варшавское, д.37, Москва\"\n" +
//                "    },\n" +
//                "    \"prePostalPreparation\": true,\n" +
//                "    \"returnAddressType\": \"POSTOFFICE_ADDRESS\",\n" +
//                "    \"terminalDeliveryAvailable\": false,\n" +
//                "    \"vsdEnabled\": false\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"additionalOperatorPostcodes\": [\n" +
//                "      \"800000\"\n" +
//                "    ],\n" +
//                "    \"availableProducts\": [\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE\",\n" +
//                "      \"INTERNATIONAL_SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"BANDEROL_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_ORDERED\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "      \"SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE\"\n" +
//                "    ],\n" +
//                "    \"availableReturnAddresses\": [],\n" +
//                "    \"checkableMailTypes\": [\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMmoMailTypes\": [],\n" +
//                "    \"courierCall\": false,\n" +
//                "    \"enabled\": true,\n" +
//                "    \"hasOnlyLetterTypes\": true,\n" +
//                "    \"mailTypes\": [\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"operatorPostcode\": \"422530\",\n" +
//                "    \"opsAddress\": \"ул Школьная, д.21, пгт Васильево, р-н Зеленодольский, Респ Татарстан\",\n" +
//                "    \"poBoxChecked\": false,\n" +
//                "    \"postalOperator\": {\n" +
//                "      \"code\": \"422530\",\n" +
//                "      \"text\": \"422530 - ул Школьная, д.21, пгт Васильево, р-н Зеленодольский, Респ Татарстан\"\n" +
//                "    },\n" +
//                "    \"prePostalPreparation\": false,\n" +
//                "    \"returnAddressType\": \"POSTOFFICE_ADDRESS\",\n" +
//                "    \"terminalDeliveryAvailable\": false,\n" +
//                "    \"vsdEnabled\": false\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"additionalOperatorPostcodes\": [\n" +
//                "      \"800000\"\n" +
//                "    ],\n" +
//                "    \"availableProducts\": [\n" +
//                "      \"SMALL_PACKET_ORDERED\",\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE\",\n" +
//                "      \"INTERNATIONAL_SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"INTERNATIONAL_BANDEROL_ORDERED\",\n" +
//                "      \"BANDEROL_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_ORDERED\",\n" +
//                "      \"LETTER_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_ORDERED\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE\",\n" +
//                "      \"SINGLE_LETTER_SIMPLE\",\n" +
//                "      \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "      \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_KIT_ORDERED\",\n" +
//                "      \"BANDEROL_CLASS_1_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"LETTER_WITH_DECLARED_VALUE_AND_CASH_ON_DELIVERY\",\n" +
//                "      \"BANDEROL_WITH_DECLARED_VALUE\"\n" +
//                "    ],\n" +
//                "    \"availableReturnAddresses\": [\n" +
//                "      {\n" +
//                "        \"code\": \"2664\",\n" +
//                "        \"text\": \"127018, г Москва, ул Сущёвский Вал, д 3/5\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"3232\",\n" +
//                "        \"text\": \"108803, г Москва, п Воскресенское, д Ямонтово, ул Лесная, д 24\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMailTypes\": [\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль международная заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SMALL_PACKET_ORDERED\",\n" +
//                "        \"text\": \"Мелкий пакет\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"checked\": true,\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"checkableMmoMailTypes\": [],\n" +
//                "    \"courierCall\": false,\n" +
//                "    \"currentReturnAddress\": \"127018, г Москва, ул Сущёвский Вал, д 3/5\",\n" +
//                "    \"enabled\": true,\n" +
//                "    \"hasOnlyLetterTypes\": false,\n" +
//                "    \"mailTypes\": [\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Бандероль 1 класса заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_BANDEROL_ORDERED\",\n" +
//                "        \"text\": \"Бандероль международная заказная\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_BANDEROL_SIMPLE\",\n" +
//                "        \"text\": \"Бандероль простая\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"BANDEROL_KIT_ORDERED\",\n" +
//                "        \"text\": \"Бандероль-комплект\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SMALL_PACKET_ORDERED\",\n" +
//                "        \"text\": \"Мелкий пакет\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_CLASS_1_ORDERED\",\n" +
//                "        \"text\": \"Письмо 1 класса заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_ORDERED\",\n" +
//                "        \"text\": \"Письмо международное заказное\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"INTERNATIONAL_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо международное простое\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"code\": \"SINGLE_LETTER_SIMPLE\",\n" +
//                "        \"text\": \"Письмо простое\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"operatorPostcode\": \"630961\",\n" +
//                "    \"opsAddress\": \"Дмитрия Шамшурина, д.45, Новосибирск, Новосибирская область\",\n" +
//                "    \"poBoxChecked\": false,\n" +
//                "    \"postalOperator\": {\n" +
//                "      \"code\": \"630961\",\n" +
//                "      \"text\": \"630961 - Дмитрия Шамшурина, д.45, Новосибирск, Новосибирская область\"\n" +
//                "    },\n" +
//                "    \"prePostalPreparation\": true,\n" +
//                "    \"returnAddressType\": \"SENDER_ADDRESS\",\n" +
//                "    \"selectedReturnAddressId\": 2664,\n" +
//                "    \"terminalDeliveryAvailable\": true,\n" +
//                "    \"vsdEnabled\": false\n" +
//                "  }\n" +
//                "]";
    }
}
