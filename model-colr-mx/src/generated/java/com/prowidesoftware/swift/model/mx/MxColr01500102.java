
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.015.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intrstPmtStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.015.001.02")
public class MxColr01500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntrstPmtStmt", required = true)
    protected InterestPaymentStatementV02 intrstPmtStmt;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, AmountAndDirection20 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, Frequency1Code.class, GenericIdentification29 .class, GenericIdentification30 .class, InterestCalculation2 .class, InterestPaymentStatementV02 .class, InterestStatement2 .class, MxColr01500102 .class, NameAndAddress6 .class, Pagination.class, PartyIdentification33Choice.class, PostalAddress2 .class, SimpleIdentificationInformation.class, Statement32 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.015.001.02";

    public MxColr01500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01500102(final String xml) {
        this();
        MxColr01500102 tmp = parse(xml);
        intrstPmtStmt = tmp.getIntrstPmtStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intrstPmtStmt property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPaymentStatementV02 }
     *     
     */
    public InterestPaymentStatementV02 getIntrstPmtStmt() {
        return intrstPmtStmt;
    }

    /**
     * Sets the value of the intrstPmtStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPaymentStatementV02 }
     *     
     */
    public MxColr01500102 setIntrstPmtStmt(InterestPaymentStatementV02 value) {
        this.intrstPmtStmt = value;
        return this;
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
    public static MxColr01500102 parse(String xml) {
        return ((MxColr01500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01500102 parse(String xml, MxRead parserImpl) {
        return ((MxColr01500102) parserImpl.read(MxColr01500102 .class, xml, _classes));
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
     * Creates an MxColr01500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01500102 message
     * @return
     *     a new instance of MxColr01500102
     */
    public final static MxColr01500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01500102 .class);
    }

}
