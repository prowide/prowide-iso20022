
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
 * Class for sese.030.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondsModReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.030.002.03")
public class MxSese03000203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondsModReq", required = true)
    protected SecuritiesSettlementConditionsModificationRequest002V03 sctiesSttlmCondsModReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 30;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalInformation8 .class, AutoBorrowing2Code.class, AutomaticBorrowing3Choice.class, ClassificationType4Choice.class, DateAndDateTimeChoice.class, DocumentNumber3Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification18 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification34 .class, HoldIndicator5 .class, IdentificationSource4Choice.class, LinkageType1Code.class, LinkageType2Choice.class, Linkages23 .class, MatchingDenied2Choice.class, MatchingProcess1Code.class, MxSese03000203 .class, NameAndAddress12 .class, OtherIdentification2 .class, PartyIdentification51Choice.class, PartyIdentification62Choice.class, PartyIdentificationAndAccount68 .class, PriorityNumeric2Choice.class, ProcessingPosition1Code.class, ProcessingPosition4Choice.class, References13 .class, References31Choice.class, Registration2Code.class, Registration8Choice.class, RegistrationReason4 .class, RequestDetails9 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesSettlementConditionsModificationRequest002V03 .class, SecuritiesTransactionType5Code.class, SecurityIdentification15 .class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.030.002.03";

    public MxSese03000203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03000203(final String xml) {
        this();
        MxSese03000203 tmp = parse(xml);
        sctiesSttlmCondsModReq = tmp.getSctiesSttlmCondsModReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03000203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondsModReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionsModificationRequest002V03 }
     *     
     */
    public SecuritiesSettlementConditionsModificationRequest002V03 getSctiesSttlmCondsModReq() {
        return sctiesSttlmCondsModReq;
    }

    /**
     * Sets the value of the sctiesSttlmCondsModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionsModificationRequest002V03 }
     *     
     */
    public MxSese03000203 setSctiesSttlmCondsModReq(SecuritiesSettlementConditionsModificationRequest002V03 value) {
        this.sctiesSttlmCondsModReq = value;
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
    public static MxSese03000203 parse(String xml) {
        return ((MxSese03000203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03000203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03000203 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03000203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03000203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03000203 parse(String xml, MxRead parserImpl) {
        return ((MxSese03000203) parserImpl.read(MxSese03000203 .class, xml, _classes));
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
     * Creates an MxSese03000203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03000203 message
     * @return
     *     a new instance of MxSese03000203
     */
    public final static MxSese03000203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03000203 .class);
    }

}
