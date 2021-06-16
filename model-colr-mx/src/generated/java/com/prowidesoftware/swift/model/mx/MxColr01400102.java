
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intrstPmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.014.001.02")
public class MxColr01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntrstPmtRspn", required = true)
    protected InterestPaymentResponseV02 intrstPmtRspn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CalculationMethod1Code.class, CollateralBalance1 .class, CollateralPurpose1Choice.class, CollateralPurpose1Code.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, Frequency1Code.class, GenericIdentification29 .class, GenericIdentification30 .class, InterestAmount2 .class, InterestComputationMethod2Code.class, InterestMethod1Code.class, InterestPaymentResponseV02 .class, InterestRate1Choice.class, InterestRejectionReason1Code.class, InterestResponse1 .class, MxColr01400102 .class, NameAndAddress6 .class, PartyIdentification33Choice.class, PostalAddress2 .class, RejectionReason21FormatChoice.class, Status4Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, VariableInterest1Rate.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.014.001.02";

    public MxColr01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01400102(final String xml) {
        this();
        MxColr01400102 tmp = parse(xml);
        intrstPmtRspn = tmp.getIntrstPmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intrstPmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPaymentResponseV02 }
     *     
     */
    public InterestPaymentResponseV02 getIntrstPmtRspn() {
        return intrstPmtRspn;
    }

    /**
     * Sets the value of the intrstPmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPaymentResponseV02 }
     *     
     */
    public MxColr01400102 setIntrstPmtRspn(InterestPaymentResponseV02 value) {
        this.intrstPmtRspn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxColr01400102 parse(String xml) {
        return ((MxColr01400102) MxReadImpl.parse(MxColr01400102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01400102 parse(String xml, MxRead parserImpl) {
        return ((MxColr01400102) parserImpl.read(MxColr01400102 .class, xml, _classes));
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
     * Creates an MxColr01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01400102 message
     * @return
     *     a new instance of MxColr01400102
     */
    public final static MxColr01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01400102 .class);
    }

}
