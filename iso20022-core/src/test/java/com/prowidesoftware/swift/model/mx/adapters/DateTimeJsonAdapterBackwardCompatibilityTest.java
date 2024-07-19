package com.prowidesoftware.swift.model.mx.adapters;

import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxSese02500109;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DateTimeJsonAdapterBackwardCompatibilityTest {
  private static final String XML_MX = """
    <?xml version="1.0"?>
    <RequestPayload xmlns="urn:iso:std:iso:20022:tech:xsd:head.003.001.01">
      <AppHdr xmlns="urn:iso:std:iso:20022:tech:xsd:head.001.001.01">
        <Fr>
          <FIId>
            <FinInstnId>
              <BICFI>IJKLMNOPXXX</BICFI>
              <Othr>
                <Id>ABCDEFGHXXX</Id>
              </Othr>
            </FinInstnId>
          </FIId>
        </Fr>
        <To>
          <FIId>
            <FinInstnId>
              <BICFI>ABCDEFGHXXX</BICFI>
              <Othr>
                <Id>ABCDEFGHXXX</Id>
              </Othr>
            </FinInstnId>
          </FIId>
        </To>
        <BizMsgIdr>1423905641002</BizMsgIdr>
        <MsgDefIdr>sese.025.001.09</MsgDefIdr>
        <CreDt>2024-07-17T05:27:51Z</CreDt>
        <CpyDplct>COPY</CpyDplct>
        <PssblDplct>true</PssblDplct>
        <Prty>2024071700000208</Prty>
      </AppHdr>
      <Document xmlns="urn:iso:std:iso:20022:tech:xsd:sese.025.001.09">
        <SctiesSttlmTxConf>
          <TxIdDtls>
            <AcctOwnrTxId>FOO</AcctOwnrTxId>
            <MktInfrstrctrTxId>BAR</MktInfrstrctrTxId>
            <PrcrTxId>TOTO</PrcrTxId>
            <SctiesMvmntTp>RECE</SctiesMvmntTp>
            <Pmt>APMT</Pmt>
            <CmonId>TITI</CmonId>
          </TxIdDtls>
          <TradDtls>
            <PlcOfTrad>
              <MktTpAndId>
                <Tp>
                  <Cd>EXCH</Cd>
                </Tp>
              </MktTpAndId>
            </PlcOfTrad>
            <PlcOfClr>
              <Id>QRSTUVWYXXX</Id>
            </PlcOfClr>
            <TradDt>
              <Dt>
                <Dt>2024-07-16</Dt>
              </Dt>
            </TradDt>
            <SttlmDt>
              <Dt>
                <Dt>2024-07-17</Dt>
              </Dt>
            </SttlmDt>
            <FctvSttlmDt>
              <Dt>
                <DtTm>2024-07-17T07:26:04.207459</DtTm>
              </Dt>
            </FctvSttlmDt>
          </TradDtls>
          <FinInstrmId>
            <ISIN>NL0000009165</ISIN>
          </FinInstrmId>
          <QtyAndAcctDtls>
            <SttldQty>
              <Qty>
                <Unit>0</Unit>
              </Qty>
            </SttldQty>
            <SfkpgAcct>
              <Id>NECISOGEFRPPAGN000L10</Id>
            </SfkpgAcct>
            <CshAcct>
              <Prtry>CFREURSOGEFRPPTIT-DCA-SGSS</Prtry>
            </CshAcct>
          </QtyAndAcctDtls>
          <SttlmParams>
            <SctiesTxTp>
              <Cd>NETT</Cd>
            </SctiesTxTp>
            <PrtlSttlmInd>PARQ</PrtlSttlmInd>
            <CshSubBalTp>
              <Id>DLVR</Id>
              <Issr>T2S</Issr>
              <SchmeNm>RT</SchmeNm>
            </CshSubBalTp>
          </SttlmParams>
          <DlvrgSttlmPties>
            <Dpstry>
              <Id>
                <AnyBIC>ABCDEFGHXXX</AnyBIC>
              </Id>
              <PrcgId>2407162881091741</PrcgId>
            </Dpstry>
            <Pty1>
              <Id>
                <AnyBIC>QRSTUVWYXXX</AnyBIC>
              </Id>
              <SfkpgAcct>
                <Id>MOTICCEGITRRXXX9100000</Id>
              </SfkpgAcct>
              <PrcgId>1VUVZK</PrcgId>
            </Pty1>
          </DlvrgSttlmPties>
          <RcvgSttlmPties>
            <Dpstry>
              <Id>
                <AnyBIC>HGFEDCBAXXX</AnyBIC>
              </Id>
            </Dpstry>
            <Pty1>
              <Id>
                <AnyBIC>SOGEFRPPAGN</AnyBIC>
              </Id>
              <SfkpgAcct>
                <Id>NECISOGEFRPPAGN000L10</Id>
              </SfkpgAcct>
              <PrcgId>FOO</PrcgId>
            </Pty1>
          </RcvgSttlmPties>
          <SttldAmt>
            <Amt Ccy="EUR">1</Amt>
            <CdtDbtInd>DBIT</CdtDbtInd>
          </SttldAmt>
          <SplmtryData>
            <PlcAndNm>/Document/SctiesSttlmTxConf/TxIdDtls</PlcAndNm>
            <Envlp>
              <Document xmlns="urn:eurosystem:xsd:DRAFT2supl.021.001.01">
                <SctiesSttlmSD1>
                  <RltdTxId>42</RltdTxId>
                </SctiesSttlmSD1>
              </Document>
            </Envlp>
          </SplmtryData>
        </SctiesSttlmTxConf>
      </Document>
    </RequestPayload>
    """;

  private static final String JSON_MX_V9 = """
    {
      "sctiesSttlmTxConf": {
        "txIdDtls": {
          "acctOwnrTxId": "FOO",
          "mktInfrstrctrTxId": "BAR",
          "prcrTxId": "TOTO",
          "sctiesMvmntTp": "RECE",
          "pmt": "APMT",
          "cmonId": "TITI"
        },
        "tradDtls": {
          "plcOfTrad": {
            "mktTpAndId": {
              "tp": {
                "cd": "EXCH"
              }
            }
          },
          "plcOfClr": {
            "id": "QRSTUVWYXXX"
          },
          "tradDt": {
            "dt": {
              "dt": {
                "year": 2024,
                "month": 7,
                "day": 16,
                "timezone": -2147483648,
                "hour": -2147483648,
                "minute": -2147483648,
                "second": -2147483648
              }
            }
          },
          "sttlmDt": {
            "dt": {
              "dt": {
                "year": 2024,
                "month": 7,
                "day": 17,
                "timezone": -2147483648,
                "hour": -2147483648,
                "minute": -2147483648,
                "second": -2147483648
              }
            }
          },
          "fctvSttlmDt": {
            "dt": {
              "dtTm": {
                "year": 2024,
                "month": 7,
                "day": 17,
                "timezone": -2147483648,
                "hour": 7,
                "minute": 26,
                "second": 4,
                "fractionalSecond": 0.207459
              }
            }
          }
        },
        "finInstrmId": {
          "isin": "NL0000009165"
        },
        "qtyAndAcctDtls": {
          "sttldQty": {
            "qty": {
              "unit": 0
            }
          },
          "sfkpgAcct": {
            "id": "NECISOGEFRPPAGN000L10"
          },
          "cshAcct": {
            "prtry": "CFREURSOGEFRPPTIT-DCA-SGSS"
          }
        },
        "sttlmParams": {
          "sctiesTxTp": {
            "cd": "NETT"
          },
          "prtlSttlmInd": "PARQ",
          "cshSubBalTp": {
            "id": "DLVR",
            "issr": "T2S",
            "schmeNm": "RT"
          }
        },
        "dlvrgSttlmPties": {
          "dpstry": {
            "id": {
              "anyBIC": "ABCDEFGHXXX"
            },
            "prcgId": "2407162881091741"
          },
          "pty1": {
            "id": {
              "anyBIC": "QRSTUVWYXXX"
            },
            "sfkpgAcct": {
              "id": "MOTICCEGITRRXXX9100000"
            },
            "prcgId": "1VUVZK"
          }
        },
        "rcvgSttlmPties": {
          "dpstry": {
            "id": {
              "anyBIC": "HGFEDCBAXXX"
            }
          },
          "pty1": {
            "id": {
              "anyBIC": "SOGEFRPPAGN"
            },
            "sfkpgAcct": {
              "id": "NECISOGEFRPPAGN000L10"
            },
            "prcgId": "FOO"
          }
        },
        "sttldAmt": {
          "amt": {
            "value": 1,
            "ccy": "EUR"
          },
          "cdtDbtInd": "DBIT"
        },
        "splmtryData": [
          {
            "plcAndNm": "/Document/SctiesSttlmTxConf/TxIdDtls",
            "envlp": {}
          }
        ]
      },
      "appHdr": {
        "fr": {
          "fiId": {
            "finInstnId": {
              "bicfi": "IJKLMNOPXXX",
              "othr": {
                "id": "ABCDEFGHXXX"
              }
            }
          }
        },
        "to": {
          "fiId": {
            "finInstnId": {
              "bicfi": "ABCDEFGHXXX",
              "othr": {
                "id": "ABCDEFGHXXX"
              }
            }
          }
        },
        "bizMsgIdr": "1423905641002",
        "msgDefIdr": "sese.025.001.09",
        "creDt": {
          "year": 2024,
          "month": 7,
          "day": 17,
          "timezone": 0,
          "hour": 5,
          "minute": 27,
          "second": 51
        },
        "cpyDplct": "COPY",
        "pssblDplct": true,
        "prty": "2024071700000208",
        "namespace": "urn:iso:std:iso:20022:tech:xsd:head.001.001.01"
      },
      "type": "MX",
      "@xmlns": "urn:iso:std:iso:20022:tech:xsd:sese.025.001.09",
      "identifier": "sese.025.001.09"
    }
    """;

  private static final String JSON_MX_V10 = """
    {
      "sctiesSttlmTxConf": {
        "txIdDtls": {
          "acctOwnrTxId": "FOO",
          "mktInfrstrctrTxId": "BAR",
          "prcrTxId": "TOTO",
          "sctiesMvmntTp": "RECE",
          "pmt": "APMT",
          "cmonId": "TITI"
        },
        "tradDtls": {
          "plcOfTrad": {
            "mktTpAndId": {
              "tp": {
                "cd": "EXCH"
              }
            }
          },
          "plcOfClr": {
            "id": "QRSTUVWYXXX"
          },
          "tradDt": {
            "dt": {
              "dt": {
                "year": 2024,
                "month": 7,
                "day": 16
              }
            }
          },
          "sttlmDt": {
            "dt": {
              "dt": {
                "year": 2024,
                "month": 7,
                "day": 17
              }
            }
          },
          "fctvSttlmDt": {
            "dt": {
              "dtTm": {
                "dateTime": {
                  "date": {
                    "year": 2024,
                    "month": 7,
                    "day": 17
                  },
                  "time": {
                    "hour": 7,
                    "minute": 26,
                    "second": 4,
                    "nano": 207459000
                  }
                },
                "offset": {
                  "totalSeconds": 7200
                }
              }
            }
          }
        },
        "finInstrmId": {
          "isin": "NL0000009165"
        },
        "qtyAndAcctDtls": {
          "sttldQty": {
            "qty": {
              "unit": 0
            }
          },
          "sfkpgAcct": {
            "id": "NECISOGEFRPPAGN000L10"
          },
          "cshAcct": {
            "prtry": "CFREURSOGEFRPPTIT-DCA-SGSS"
          }
        },
        "sttlmParams": {
          "sctiesTxTp": {
            "cd": "NETT"
          },
          "prtlSttlmInd": "PARQ",
          "cshSubBalTp": {
            "id": "DLVR",
            "issr": "T2S",
            "schmeNm": "RT"
          }
        },
        "dlvrgSttlmPties": {
          "dpstry": {
            "id": {
              "anyBIC": "ABCDEFGHXXX"
            },
            "prcgId": "2407162881091741"
          },
          "pty1": {
            "id": {
              "anyBIC": "QRSTUVWYXXX"
            },
            "sfkpgAcct": {
              "id": "MOTICCEGITRRXXX9100000"
            },
            "prcgId": "1VUVZK"
          }
        },
        "rcvgSttlmPties": {
          "dpstry": {
            "id": {
              "anyBIC": "HGFEDCBAXXX"
            }
          },
          "pty1": {
            "id": {
              "anyBIC": "SOGEFRPPAGN"
            },
            "sfkpgAcct": {
              "id": "NECISOGEFRPPAGN000L10"
            },
            "prcgId": "FOO"
          }
        },
        "sttldAmt": {
          "amt": {
            "value": 1,
            "ccy": "EUR"
          },
          "cdtDbtInd": "DBIT"
        },
        "splmtryData": [
          {
            "plcAndNm": "/Document/SctiesSttlmTxConf/TxIdDtls",
            "envlp": {}
          }
        ]
      },
      "appHdr": {
        "fr": {
          "fiId": {
            "finInstnId": {
              "bicfi": "IJKLMNOPXXX",
              "othr": {
                "id": "ABCDEFGHXXX"
              }
            }
          }
        },
        "to": {
          "fiId": {
            "finInstnId": {
              "bicfi": "ABCDEFGHXXX",
              "othr": {
                "id": "ABCDEFGHXXX"
              }
            }
          }
        },
        "bizMsgIdr": "1423905641002",
        "msgDefIdr": "sese.025.001.09",
        "creDt": {
          "dateTime": {
            "date": {
              "year": 2024,
              "month": 7,
              "day": 17
            },
            "time": {
              "hour": 5,
              "minute": 27,
              "second": 51,
              "nano": 0
            }
          },
          "offset": {
            "totalSeconds": 0
          }
        },
        "cpyDplct": "COPY",
        "pssblDplct": true,
        "prty": "2024071700000208",
        "namespace": "urn:iso:std:iso:20022:tech:xsd:head.001.001.01"
      },
      "type": "MX",
      "@xmlns": "urn:iso:std:iso:20022:tech:xsd:sese.025.001.09",
      "identifier": "sese.025.001.09"
    }
    """;

  @Test
  void v10_should_be_able_to_parse_json_with_date_time_created_from_v9() {
    final MxSese02500109 mx = (MxSese02500109) AbstractMX.fromJson(JSON_MX_V9);
    assertThat(mx.getSctiesSttlmTxConf().getTradDtls().getTradDt().getDt().getDt()).isNotNull(); // Success
    assertThat(mx.getSctiesSttlmTxConf().getTradDtls().getFctvSttlmDt().getDt().getDtTm()).isNotNull(); // Fail
  }

  @Test
  void v10_should_be_able_to_parse_json_from_v9_and_read_same_content_than_json_from_v10_and_xml() {
    final MxSese02500109 reference  = (MxSese02500109) AbstractMX.parse(XML_MX);
    final MxSese02500109 fromV9     = (MxSese02500109) AbstractMX.fromJson(JSON_MX_V9);
    final String         toV10      = reference.toJson();
    final MxSese02500109 fromV10    = (MxSese02500109) AbstractMX.fromJson(JSON_MX_V10);

    assertThat(fromV9).isEqualTo(reference);
    assertThat(fromV10).isEqualTo(reference);
    assertThat(fromV9).isEqualTo(fromV10);
    assertThat(toV10).isEqualToIgnoringWhitespace(JSON_MX_V10);
    assertThat(toV10).isNotEqualToIgnoringWhitespace(JSON_MX_V9);
  }
}
