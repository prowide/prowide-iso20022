
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
 * Class for colr.008.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collPrpslRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.008.001.05")
public class MxColr00800105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollPrpslRspn", required = true)
    protected CollateralProposalResponseV05 collPrpslRspn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, CashCollateralResponse2 .class, CollateralAccount3 .class, CollateralAccountIdentificationType3Choice.class, CollateralAccountType1Code.class, CollateralProposalResponse1Code.class, CollateralProposalResponse3 .class, CollateralProposalResponse3Choice.class, CollateralProposalResponseType3 .class, CollateralProposalResponseV05 .class, CollateralResponse2 .class, DateAndDateTimeChoice.class, ExposureType5Code.class, GenericAccountIdentification1 .class, GenericIdentification36 .class, MxColr00800105 .class, NameAndAddress6 .class, Obligation5 .class, OtherCollateralResponse2 .class, PartyIdentification100Choice.class, PostalAddress2 .class, RejectionReasonV021Code.class, SecuritiesCollateralResponse1 .class, Status4Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.008.001.05";

    public MxColr00800105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00800105(final String xml) {
        this();
        MxColr00800105 tmp = parse(xml);
        collPrpslRspn = tmp.getCollPrpslRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00800105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collPrpslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponseV05 }
     *     
     */
    public CollateralProposalResponseV05 getCollPrpslRspn() {
        return collPrpslRspn;
    }

    /**
     * Sets the value of the collPrpslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponseV05 }
     *     
     */
    public MxColr00800105 setCollPrpslRspn(CollateralProposalResponseV05 value) {
        this.collPrpslRspn = value;
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
    public static MxColr00800105 parse(String xml) {
        return ((MxColr00800105) MxReadImpl.parse(MxColr00800105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00800105 parse(String xml, MxRead parserImpl) {
        return ((MxColr00800105) parserImpl.read(MxColr00800105 .class, xml, _classes));
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
     * Creates an MxColr00800105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00800105 message
     * @return
     *     a new instance of MxColr00800105
     */
    public final static MxColr00800105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00800105 .class);
    }

}
