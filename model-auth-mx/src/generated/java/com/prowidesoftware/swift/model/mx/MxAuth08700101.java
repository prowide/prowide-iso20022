
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.087.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "taxIncmStmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1auth.087.001.01")
public class MxAuth08700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TaxIncmStmtRpt", required = true)
    protected TaxIncomeStatementReportV01 taxIncmStmtRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 87;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, DateAndDateTime2Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxAuth08700101 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification71Choice.class, PostalAddress1 .class, SecuritiesAccount19 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxIncomeAmount1 .class, TaxIncomeAmount2 .class, TaxIncomeAmount3 .class, TaxIncomeCapitalGain1 .class, TaxIncomeCommonData1 .class, TaxIncomeDomestic1 .class, TaxIncomeForeign1 .class, TaxIncomeHeader1 .class, TaxIncomeNonAssessable1 .class, TaxIncomeOtherDeduction1 .class, TaxIncomePartA1 .class, TaxIncomePartB1 .class, TaxIncomePartC1 .class, TaxIncomeStatementReportV01 .class, TaxIncomeStatus1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1auth.087.001.01";

    public MxAuth08700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08700101(final String xml) {
        this();
        MxAuth08700101 tmp = parse(xml);
        taxIncmStmtRpt = tmp.getTaxIncmStmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the taxIncmStmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeStatementReportV01 }
     *     
     */
    public TaxIncomeStatementReportV01 getTaxIncmStmtRpt() {
        return taxIncmStmtRpt;
    }

    /**
     * Sets the value of the taxIncmStmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeStatementReportV01 }
     *     
     */
    public MxAuth08700101 setTaxIncmStmtRpt(TaxIncomeStatementReportV01 value) {
        this.taxIncmStmtRpt = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAuth08700101 parse(String xml) {
        return ((MxAuth08700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth08700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth08700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08700101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08700101) parserImpl.read(MxAuth08700101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxAuth08700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08700101 message
     * @return
     *     a new instance of MxAuth08700101
     */
    public static final MxAuth08700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08700101 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
