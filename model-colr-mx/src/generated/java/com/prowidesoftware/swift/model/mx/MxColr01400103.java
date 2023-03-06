
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.014.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intrstPmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.014.001.03")
public class MxColr01400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntrstPmtRspn", required = true)
    protected InterestPaymentResponseV03 intrstPmtRspn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CalculationMethod1Code.class, CollateralAccount1 .class, CollateralAccountIdentificationType1Choice.class, CollateralAccountType1Code.class, CollateralBalance1 .class, CollateralPurpose1Choice.class, CollateralPurpose1Code.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, ExposureType5Code.class, Frequency1Code.class, GenericIdentification29 .class, GenericIdentification30 .class, InterestAmount2 .class, InterestComputationMethod2Code.class, InterestMethod1Code.class, InterestPaymentResponseV03 .class, InterestRate1Choice.class, InterestRejectionReason1Code.class, InterestResponse1 .class, MxColr01400103 .class, NameAndAddress6 .class, Obligation3 .class, PartyIdentification33Choice.class, PostalAddress2 .class, RejectionReason21FormatChoice.class, Status4Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, VariableInterest1Rate.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.014.001.03";

    public MxColr01400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01400103(final String xml) {
        this();
        MxColr01400103 tmp = parse(xml);
        intrstPmtRspn = tmp.getIntrstPmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intrstPmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPaymentResponseV03 }
     *     
     */
    public InterestPaymentResponseV03 getIntrstPmtRspn() {
        return intrstPmtRspn;
    }

    /**
     * Sets the value of the intrstPmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPaymentResponseV03 }
     *     
     */
    public MxColr01400103 setIntrstPmtRspn(InterestPaymentResponseV03 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr01400103 parse(String xml) {
        return ((MxColr01400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01400103 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01400103 parse(String xml, MxRead parserImpl) {
        return ((MxColr01400103) parserImpl.read(MxColr01400103 .class, xml, _classes));
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
     * Creates an MxColr01400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01400103 message
     * @return
     *     a new instance of MxColr01400103
     */
    public final static MxColr01400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01400103 .class);
    }

}
