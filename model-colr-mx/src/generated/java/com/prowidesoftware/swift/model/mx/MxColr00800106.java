
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
 * Class for colr.008.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collPrpslRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.008.001.06")
public class MxColr00800106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollPrpslRspn", required = true)
    protected CollateralProposalResponseV06 collPrpslRspn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, BlockChainAddressWallet5 .class, CashCollateralResponse3 .class, CollateralAccount3 .class, CollateralAccountIdentificationType3Choice.class, CollateralAccountType1Code.class, CollateralProposalResponse1Code.class, CollateralProposalResponse4 .class, CollateralProposalResponse4Choice.class, CollateralProposalResponseType4 .class, CollateralProposalResponseV06 .class, CollateralResponse3 .class, DateAndDateTime2Choice.class, ExposureType11Code.class, GenericAccountIdentification1 .class, GenericIdentification36 .class, MxColr00800106 .class, NameAndAddress6 .class, Obligation9 .class, OtherCollateralResponse3 .class, PartyIdentification178Choice.class, PostalAddress2 .class, RejectionReason68Code.class, SecuritiesCollateralResponse2 .class, Status4Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.008.001.06";

    public MxColr00800106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00800106(final String xml) {
        this();
        MxColr00800106 tmp = parse(xml);
        collPrpslRspn = tmp.getCollPrpslRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00800106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collPrpslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponseV06 }
     *     
     */
    public CollateralProposalResponseV06 getCollPrpslRspn() {
        return collPrpslRspn;
    }

    /**
     * Sets the value of the collPrpslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponseV06 }
     *     
     */
    public MxColr00800106 setCollPrpslRspn(CollateralProposalResponseV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr00800106 parse(String xml) {
        return ((MxColr00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00800106 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00800106 parse(String xml, MxRead parserImpl) {
        return ((MxColr00800106) parserImpl.read(MxColr00800106 .class, xml, _classes));
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
     * Creates an MxColr00800106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00800106 message
     * @return
     *     a new instance of MxColr00800106
     */
    public final static MxColr00800106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00800106 .class);
    }

}
