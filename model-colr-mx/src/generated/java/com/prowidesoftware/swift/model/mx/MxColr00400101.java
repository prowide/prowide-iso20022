
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
 * Class for colr.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mrgnCallRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.004.001.01")
public class MxColr00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MrgnCallRspn", required = true)
    protected MarginCallResponseV01 mrgnCallRspn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AggregatedIndependentAmount1 .class, AgreedAmount1 .class, AgreedAmount1Choice.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, Amount1 .class, Collateral1 .class, CollateralBalance1Choice.class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, ExposureConventionType1Code.class, ExposureType1Code.class, GenericIdentification29 .class, GenericIdentification30 .class, IndependentAmount1 .class, IndependentAmount2 .class, IndependentAmountConventionType1Code.class, Margin1 .class, MarginCall1 .class, MarginCallResponse1Code.class, MarginCallResponseV01 .class, MarginCollateral1 .class, MarginTerms1Choice.class, MxColr00400101 .class, NameAndAddress6 .class, Obligation1 .class, PartyIdentification33Choice.class, PostalAddress2 .class, Response1 .class, ResponseType1Choice.class, RoundingMethod1Code.class, SegregatedIndependentAmountMargin1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ThresholdType1Code.class, TransactionAndDocumentIdentification3 .class, VariationMargin1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.004.001.01";

    public MxColr00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00400101(final String xml) {
        this();
        MxColr00400101 tmp = parse(xml);
        mrgnCallRspn = tmp.getMrgnCallRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mrgnCallRspn property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResponseV01 }
     *     
     */
    public MarginCallResponseV01 getMrgnCallRspn() {
        return mrgnCallRspn;
    }

    /**
     * Sets the value of the mrgnCallRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResponseV01 }
     *     
     */
    public MxColr00400101 setMrgnCallRspn(MarginCallResponseV01 value) {
        this.mrgnCallRspn = value;
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
    public static MxColr00400101 parse(String xml) {
        return ((MxColr00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00400101 parse(String xml, MxRead parserImpl) {
        return ((MxColr00400101) parserImpl.read(MxColr00400101 .class, xml, _classes));
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
     * Creates an MxColr00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00400101 message
     * @return
     *     a new instance of MxColr00400101
     */
    public final static MxColr00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00400101 .class);
    }

}
