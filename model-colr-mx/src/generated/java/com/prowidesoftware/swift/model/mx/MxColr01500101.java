
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
 * Class for colr.015.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intrstPmtStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:colr.015.001.01")
public class MxColr01500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntrstPmtStmt", required = true)
    protected InterestPaymentStatementV01 intrstPmtStmt;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, DocumentIdentification11 .class, Frequency1Code.class, GenericIdentification29 .class, GenericIdentification30 .class, InterestCalculation1 .class, InterestPaymentStatementV01 .class, InterestStatement1 .class, MxColr01500101 .class, NameAndAddress6 .class, Pagination.class, PartyIdentification33Choice.class, PostalAddress2 .class, Statement32 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:colr.015.001.01";

    public MxColr01500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01500101(final String xml) {
        this();
        MxColr01500101 tmp = parse(xml);
        intrstPmtStmt = tmp.getIntrstPmtStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intrstPmtStmt property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPaymentStatementV01 }
     *     
     */
    public InterestPaymentStatementV01 getIntrstPmtStmt() {
        return intrstPmtStmt;
    }

    /**
     * Sets the value of the intrstPmtStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPaymentStatementV01 }
     *     
     */
    public MxColr01500101 setIntrstPmtStmt(InterestPaymentStatementV01 value) {
        this.intrstPmtStmt = value;
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
    public static MxColr01500101 parse(String xml) {
        return ((MxColr01500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01500101 parse(String xml, MxRead parserImpl) {
        return ((MxColr01500101) parserImpl.read(MxColr01500101 .class, xml, _classes));
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
     * Creates an MxColr01500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01500101 message
     * @return
     *     a new instance of MxColr01500101
     */
    public static final MxColr01500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01500101 .class);
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
