
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
 * Class for seev.040.002.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.040.002.09")
public class MxSeev04000209
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReq", required = true)
    protected CorporateActionInstructionCancellationRequest002V09 corpActnInstrCxlReq;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 40;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification49 .class, CorporateActionEventType29Code.class, CorporateActionEventType90Choice.class, CorporateActionGeneralInformation146 .class, CorporateActionInstructionCancellationRequest002V09 .class, CorporateActionOption13Code.class, CorporateActionOption170 .class, CorporateActionOption35Choice.class, DocumentIdentification37 .class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification89 .class, IdentificationSource4Choice.class, MxSeev04000209 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProtectInstruction7 .class, ProtectTransactionType3Code.class, Quantity1Code.class, Quantity40Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat34Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText9 .class, SecurityIdentification21 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.040.002.09";

    public MxSeev04000209() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04000209(final String xml) {
        this();
        MxSeev04000209 tmp = parse(xml);
        corpActnInstrCxlReq = tmp.getCorpActnInstrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04000209(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequest002V09 }
     *     
     */
    public CorporateActionInstructionCancellationRequest002V09 getCorpActnInstrCxlReq() {
        return corpActnInstrCxlReq;
    }

    /**
     * Sets the value of the corpActnInstrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequest002V09 }
     *     
     */
    public MxSeev04000209 setCorpActnInstrCxlReq(CorporateActionInstructionCancellationRequest002V09 value) {
        this.corpActnInstrCxlReq = value;
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
    public static MxSeev04000209 parse(String xml) {
        return ((MxSeev04000209) MxReadImpl.parse(MxSeev04000209 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04000209 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04000209) parserImpl.read(MxSeev04000209 .class, xml, _classes));
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
     * Creates an MxSeev04000209 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04000209 message
     * @return
     *     a new instance of MxSeev04000209
     */
    public final static MxSeev04000209 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04000209 .class);
    }

}
